<<<<<<< HEAD:src/org/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource.java
package org.andengine.opengl.texture.atlas.bitmap.source;

import java.io.IOException;
import java.io.InputStream;

import org.andengine.opengl.texture.atlas.source.BaseTextureAtlasSource;
import org.andengine.util.StreamUtils;
import org.andengine.util.debug.Debug;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:07:52 - 09.03.2010
 */
public class AssetBitmapTextureAtlasSource extends BaseTextureAtlasSource implements IBitmapTextureAtlasSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final AssetManager mAssetManager;
	private final String mAssetPath;

	// ===========================================================
	// Constructors
	// ===========================================================

	public static AssetBitmapTextureAtlasSource create(final AssetManager pAssetManager, final String pAssetPath) {
		return AssetBitmapTextureAtlasSource.create(pAssetManager, pAssetPath, 0, 0);
	}

	public static AssetBitmapTextureAtlasSource create(final AssetManager pAssetManager, final String pAssetPath, final int pTextureX, final int pTextureY) {
		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inJustDecodeBounds = true;

		InputStream in = null;
		try {
			in = pAssetManager.open(pAssetPath);
			BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + pAssetPath, e);
		} finally {
			StreamUtils.close(in);
		}

		return new AssetBitmapTextureAtlasSource(pAssetManager, pAssetPath, pTextureX, pTextureY, decodeOptions.outWidth, decodeOptions.outHeight);
	}

	AssetBitmapTextureAtlasSource(final AssetManager pAssetManager, final String pAssetPath, final int pTextureX, final int pTextureY, final int pTextureWidth, final int pTextureHeight) {
		super(pTextureX, pTextureY, pTextureWidth, pTextureHeight);

		this.mAssetManager = pAssetManager;
		this.mAssetPath = pAssetPath;
	}

	@Override
	public AssetBitmapTextureAtlasSource deepCopy() {
		return new AssetBitmapTextureAtlasSource(this.mAssetManager, this.mAssetPath, this.mTextureX, this.mTextureY, this.mTextureWidth, this.mTextureHeight);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public Bitmap onLoadBitmap(final Config pBitmapConfig) {
		InputStream in = null;
		try {
			final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
			decodeOptions.inPreferredConfig = pBitmapConfig;

			in = this.mAssetManager.open(this.mAssetPath);
			return BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in " + this.getClass().getSimpleName() + ". AssetPath: " + this.mAssetPath, e);
			return null;
		} finally {
			StreamUtils.close(in);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(" + this.mAssetPath + ")";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
=======
package org.anddev.andengine.opengl.texture.atlas.bitmap.source;

import java.io.IOException;
import java.io.InputStream;

import org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource;
import org.anddev.andengine.util.Debug;
import org.anddev.andengine.util.StreamUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:07:52 - 09.03.2010
 */
public class AssetBitmapTextureAtlasSource extends BaseTextureAtlasSource implements IBitmapTextureAtlasSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final int mWidth;
	private final int mHeight;

	private final String mAssetPath;
	private final Context mContext;

	// ===========================================================
	// Constructors
	// ===========================================================

	public AssetBitmapTextureAtlasSource(final Context pContext, final String pAssetPath) {
		this(pContext, pAssetPath, 0, 0);
	}

	public AssetBitmapTextureAtlasSource(final Context pContext, final String pAssetPath, final int pTexturePositionX, final int pTexturePositionY) {
		super(pTexturePositionX, pTexturePositionY);
		this.mContext = pContext;
		this.mAssetPath = pAssetPath;

		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inJustDecodeBounds = true;

		InputStream in = null;
		try {
			in = pContext.getAssets().open(pAssetPath);
			BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + pAssetPath, e);
		} finally {
			StreamUtils.close(in);
		}

		this.mWidth = decodeOptions.outWidth;
		this.mHeight = decodeOptions.outHeight;
	}

	AssetBitmapTextureAtlasSource(final Context pContext, final String pAssetPath, final int pTexturePositionX, final int pTexturePositionY, final int pWidth, final int pHeight) {
		super(pTexturePositionX, pTexturePositionY);
		this.mContext = pContext;
		this.mAssetPath = pAssetPath;
		this.mWidth = pWidth;
		this.mHeight = pHeight;
	}

	@Override
	public AssetBitmapTextureAtlasSource deepCopy() {
		return new AssetBitmapTextureAtlasSource(this.mContext, this.mAssetPath, this.mTexturePositionX, this.mTexturePositionY, this.mWidth, this.mHeight);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public int getWidth() {
		return this.mWidth;
	}

	@Override
	public int getHeight() {
		return this.mHeight;
	}

	@Override
	public Bitmap onLoadBitmap(final Config pBitmapConfig) {
		InputStream in = null;
		try {
			final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
			decodeOptions.inPreferredConfig = pBitmapConfig;

			in = this.mContext.getAssets().open(this.mAssetPath);
			return BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in " + this.getClass().getSimpleName() + ". AssetPath: " + this.mAssetPath, e);
			return null;
		} finally {
			StreamUtils.close(in);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(" + this.mAssetPath + ")";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
>>>>>>> upstream/master:src/org/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource.java
}
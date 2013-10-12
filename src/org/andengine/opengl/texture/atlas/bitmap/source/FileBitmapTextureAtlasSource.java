<<<<<<< HEAD:src/org/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource.java
package org.andengine.opengl.texture.atlas.bitmap.source;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.andengine.opengl.texture.atlas.source.BaseTextureAtlasSource;
import org.andengine.util.FileUtils;
import org.andengine.util.StreamUtils;
import org.andengine.util.debug.Debug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

/**
 * 
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:39:22 - 10.08.2010
 */
public class FileBitmapTextureAtlasSource extends BaseTextureAtlasSource implements IBitmapTextureAtlasSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final File mFile;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public static FileBitmapTextureAtlasSource create(final File pFile) {
		return FileBitmapTextureAtlasSource.create(pFile, 0, 0);
	}

	public static FileBitmapTextureAtlasSource create(final File pFile, final int pTextureX, final int pTextureY) {
		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inJustDecodeBounds = true;

		InputStream in = null;
		try {
			in = new FileInputStream(pFile);
			BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in " + FileBitmapTextureAtlasSource.class.getSimpleName() + ". File: " + pFile, e);
		} finally {
			StreamUtils.close(in);
		}

		return new FileBitmapTextureAtlasSource(pFile, pTextureX, pTextureY, decodeOptions.outWidth, decodeOptions.outHeight);
	}

	public static FileBitmapTextureAtlasSource createFromInternalStorage(final Context pContext, final String pFilePath, final int pTextureX, final int pTextureY) {
		return FileBitmapTextureAtlasSource.create(new File(FileUtils.getAbsolutePathOnInternalStorage(pContext, pFilePath)), pTextureX, pTextureY);
	}

	public static FileBitmapTextureAtlasSource createFromExternalStorage(final Context pContext, final String pFilePath, final int pTextureX, final int pTextureY) {
		return FileBitmapTextureAtlasSource.create(new File(FileUtils.getAbsolutePathOnExternalStorage(pContext, pFilePath)), pTextureX, pTextureY);
	}

	FileBitmapTextureAtlasSource(final File pFile, final int pTextureX, final int pTextureY, final int pTextureWidth, final int pTextureHeight) {
		super(pTextureX, pTextureY, pTextureWidth, pTextureHeight);

		this.mFile = pFile;
	}

	@Override
	public FileBitmapTextureAtlasSource deepCopy() {
		return new FileBitmapTextureAtlasSource(this.mFile, this.mTextureX, this.mTextureY, this.mTextureWidth, this.mTextureHeight);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public Bitmap onLoadBitmap(final Config pBitmapConfig) {
		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inPreferredConfig = pBitmapConfig;

		InputStream in = null;
		try {
			in = new FileInputStream(this.mFile);
			return BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in " + this.getClass().getSimpleName() + ". File: " + this.mFile, e);
			return null;
		} finally {
			StreamUtils.close(in);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(" + this.mFile + ")";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
=======
package org.anddev.andengine.opengl.texture.atlas.bitmap.source;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource;
import org.anddev.andengine.util.Debug;
import org.anddev.andengine.util.StreamUtils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

/**
 * 
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:39:22 - 10.08.2010
 */
public class FileBitmapTextureAtlasSource extends BaseTextureAtlasSource implements IBitmapTextureAtlasSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final int mWidth;
	private final int mHeight;

	private final File mFile;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public FileBitmapTextureAtlasSource(final File pFile) {
		this(pFile, 0, 0);
	}

	public FileBitmapTextureAtlasSource(final File pFile, final int pTexturePositionX, final int pTexturePositionY) {
		super(pTexturePositionX, pTexturePositionY);
		this.mFile = pFile;

		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inJustDecodeBounds = true;

		InputStream in = null;
		try {
			in = new FileInputStream(pFile);
			BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in FileBitmapTextureAtlasSource. File: " + pFile, e);
		} finally {
			StreamUtils.close(in);
		}

		this.mWidth = decodeOptions.outWidth;
		this.mHeight = decodeOptions.outHeight;
	}

	FileBitmapTextureAtlasSource(final File pFile, final int pTexturePositionX, final int pTexturePositionY, final int pWidth, final int pHeight) {
		super(pTexturePositionX, pTexturePositionY);
		this.mFile = pFile;
		this.mWidth = pWidth;
		this.mHeight = pHeight;
	}

	@Override
	public FileBitmapTextureAtlasSource deepCopy() {
		return new FileBitmapTextureAtlasSource(this.mFile, this.mTexturePositionX, this.mTexturePositionY, this.mWidth, this.mHeight);
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
		final BitmapFactory.Options decodeOptions = new BitmapFactory.Options();
		decodeOptions.inPreferredConfig = pBitmapConfig;

		InputStream in = null;
		try {
			in = new FileInputStream(this.mFile);
			return BitmapFactory.decodeStream(in, null, decodeOptions);
		} catch (final IOException e) {
			Debug.e("Failed loading Bitmap in " + this.getClass().getSimpleName() + ". File: " + this.mFile, e);
			return null;
		} finally {
			StreamUtils.close(in);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(" + this.mFile + ")";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
>>>>>>> upstream/master:src/org/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource.java
}
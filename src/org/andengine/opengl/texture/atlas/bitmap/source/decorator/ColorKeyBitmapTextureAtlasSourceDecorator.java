<<<<<<< HEAD:src/org/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorKeyBitmapTextureAtlasSourceDecorator.java
package org.andengine.opengl.texture.atlas.bitmap.source.decorator;

import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape;
import org.andengine.util.color.Color;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 22:16:41 - 06.08.2010
 */
public class ColorKeyBitmapTextureAtlasSourceDecorator extends ColorSwapBitmapTextureAtlasSourceDecorator {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final Color pColorKeyColor) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, Color.TRANSPARENT);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColorARGBPackedInt) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColorARGBPackedInt, Color.TRANSPARENT_ARGB_PACKED_INT);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final Color pColorKeyColor, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, Color.TRANSPARENT, pTextureAtlasSourceDecoratorOptions);
	}
	
	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColorARGBPackedInt, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColorARGBPackedInt, Color.TRANSPARENT_ARGB_PACKED_INT, pTextureAtlasSourceDecoratorOptions);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final Color pColorKeyColor, final int pTolerance) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, pTolerance, Color.TRANSPARENT);
	}
	
	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColorARGBPackedInt, final int pTolerance) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColorARGBPackedInt, pTolerance, Color.TRANSPARENT_ARGB_PACKED_INT);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final Color pColorKeyColor, final int pTolerance, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, pTolerance, Color.TRANSPARENT, pTextureAtlasSourceDecoratorOptions);
	}
	
	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColorARGBPackedInt, final int pTolerance, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColorARGBPackedInt, pTolerance, Color.TRANSPARENT_ARGB_PACKED_INT, pTextureAtlasSourceDecoratorOptions);
	}

	@Override
	public ColorKeyBitmapTextureAtlasSourceDecorator deepCopy() {
		return new ColorKeyBitmapTextureAtlasSourceDecorator(this.mBitmapTextureAtlasSource, this.mBitmapTextureAtlasSourceDecoratorShape, this.mColorKeyColorARGBPackedInt, this.mTolerance, this.mTextureAtlasSourceDecoratorOptions);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
=======
package org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator;

import org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape;

import android.graphics.Color;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 22:16:41 - 06.08.2010
 */
public class ColorKeyBitmapTextureAtlasSourceDecorator extends ColorSwapBitmapTextureAtlasSourceDecorator {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColor) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, Color.TRANSPARENT);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColor, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, Color.TRANSPARENT, pTextureAtlasSourceDecoratorOptions);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColor, final int pTolerance) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, Color.TRANSPARENT, pTolerance);
	}

	public ColorKeyBitmapTextureAtlasSourceDecorator(final IBitmapTextureAtlasSource pBitmapTextureAtlasSource, final IBitmapTextureAtlasSourceDecoratorShape pBitmapTextureAtlasSourceDecoratorShape, final int pColorKeyColor, final int pTolerance, final TextureAtlasSourceDecoratorOptions pTextureAtlasSourceDecoratorOptions) {
		super(pBitmapTextureAtlasSource, pBitmapTextureAtlasSourceDecoratorShape, pColorKeyColor, pTolerance, Color.TRANSPARENT, pTextureAtlasSourceDecoratorOptions);
	}

	@Override
	public ColorKeyBitmapTextureAtlasSourceDecorator deepCopy() {
		return new ColorKeyBitmapTextureAtlasSourceDecorator(this.mBitmapTextureAtlasSource, this.mBitmapTextureAtlasSourceDecoratorShape, this.mColorKeyColor, this.mTolerance, this.mTextureAtlasSourceDecoratorOptions);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
>>>>>>> upstream/master:src/org/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorKeyBitmapTextureAtlasSourceDecorator.java

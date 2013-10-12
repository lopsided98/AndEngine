<<<<<<< HEAD:src/org/andengine/entity/scene/background/modifier/IBackgroundModifier.java
package org.andengine.entity.scene.background.modifier;

import org.andengine.entity.scene.background.IBackground;
import org.andengine.util.modifier.IModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 14:55:54 - 03.09.2010
 */
public interface IBackgroundModifier extends IModifier<IBackground> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	@Override
	public IBackgroundModifier deepCopy() throws DeepCopyNotSupportedException;

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

	public static interface IBackgroundModifierListener extends IModifierListener<IBackground>{
		// ===========================================================
		// Constants
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
}
=======
package org.anddev.andengine.entity.scene.background.modifier;

import org.anddev.andengine.entity.scene.background.IBackground;
import org.anddev.andengine.util.modifier.IModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 14:55:54 - 03.09.2010
 */
public interface IBackgroundModifier extends IModifier<IBackground> {
	// ===========================================================
	// Final Fields
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	@Override
	public IBackgroundModifier deepCopy() throws DeepCopyNotSupportedException;

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

	public static interface IBackgroundModifierListener extends IModifierListener<IBackground>{
		// ===========================================================
		// Final Fields
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
}
>>>>>>> upstream/master:src/org/anddev/andengine/entity/scene/background/modifier/IBackgroundModifier.java

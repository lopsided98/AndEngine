<<<<<<< HEAD:src/org/andengine/entity/modifier/IEntityModifier.java
package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.util.IMatcher;
import org.andengine.util.modifier.IModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:17:50 - 19.03.2010
 */
public interface IEntityModifier extends IModifier<IEntity> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	@Override
	public IEntityModifier deepCopy() throws DeepCopyNotSupportedException;

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

	public static interface IEntityModifierListener extends IModifierListener<IEntity>{
		// ===========================================================
		// Constants
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
	
	public interface IEntityModifierMatcher extends IMatcher<IModifier<IEntity>> {
		// ===========================================================
		// Constants
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
}
=======
package org.anddev.andengine.entity.modifier;

import org.anddev.andengine.entity.IEntity;
import org.anddev.andengine.util.IMatcher;
import org.anddev.andengine.util.modifier.IModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:17:50 - 19.03.2010
 */
public interface IEntityModifier extends IModifier<IEntity> {
	// ===========================================================
	// Final Fields
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	@Override
	public IEntityModifier deepCopy() throws DeepCopyNotSupportedException;

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

	public static interface IEntityModifierListener extends IModifierListener<IEntity>{
		// ===========================================================
		// Final Fields
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
	
	public interface IEntityModifierMatcher extends IMatcher<IModifier<IEntity>> {
		// ===========================================================
		// Constants
		// ===========================================================

		// ===========================================================
		// Methods
		// ===========================================================
	}
}
>>>>>>> upstream/master:src/org/anddev/andengine/entity/modifier/IEntityModifier.java

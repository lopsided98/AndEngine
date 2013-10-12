<<<<<<< HEAD:src/org/andengine/entity/modifier/RotationAtModifier.java
package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.util.modifier.ease.EaseLinear;
import org.andengine.util.modifier.ease.IEaseFunction;


/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 21:59:38 - 06.07.2010
 */
public class RotationAtModifier extends RotationModifier {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final float mRotationCenterX;
	private final float mRotationCenterY;

	// ===========================================================
	// Constructors
	// ===========================================================

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY) {
		this(pDuration, pFromRotation, pToRotation, pRotationCenterX, pRotationCenterY, EaseLinear.getInstance());
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEaseFunction pEaseFunction) {
		this(pDuration, pFromRotation, pToRotation, pRotationCenterX, pRotationCenterY, null, pEaseFunction);
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEntityModifierListener pEntityModifierListener) {
		this(pDuration, pFromRotation, pToRotation, pRotationCenterX, pRotationCenterY, pEntityModifierListener, EaseLinear.getInstance());
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEntityModifierListener pEntityModifierListener, final IEaseFunction pEaseFunction) {
		super(pDuration, pFromRotation, pToRotation, pEntityModifierListener, pEaseFunction);

		this.mRotationCenterX = pRotationCenterX;
		this.mRotationCenterY = pRotationCenterY;
	}

	protected RotationAtModifier(final RotationAtModifier pRotationAtModifier) {
		super(pRotationAtModifier);

		this.mRotationCenterX = pRotationAtModifier.mRotationCenterX;
		this.mRotationCenterY = pRotationAtModifier.mRotationCenterY;
	}

	@Override
	public RotationAtModifier deepCopy(){
		return new RotationAtModifier(this);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void onManagedInitialize(final IEntity pEntity) {
		super.onManagedInitialize(pEntity);
		pEntity.setRotationCenter(this.mRotationCenterX, this.mRotationCenterY);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
=======
package org.anddev.andengine.entity.modifier;

import org.anddev.andengine.entity.IEntity;
import org.anddev.andengine.util.modifier.ease.IEaseFunction;


/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 21:59:38 - 06.07.2010
 */
public class RotationAtModifier extends RotationModifier {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final float mRotationCenterX;
	private final float mRotationCenterY;

	// ===========================================================
	// Constructors
	// ===========================================================

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY) {
		super(pDuration, pFromRotation, pToRotation, IEaseFunction.DEFAULT);
		this.mRotationCenterX = pRotationCenterX;
		this.mRotationCenterY = pRotationCenterY;
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEaseFunction pEaseFunction) {
		super(pDuration, pFromRotation, pToRotation, pEaseFunction);
		this.mRotationCenterX = pRotationCenterX;
		this.mRotationCenterY = pRotationCenterY;
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEntityModifierListener pEntityModifierListener) {
		super(pDuration, pFromRotation, pToRotation, pEntityModifierListener, IEaseFunction.DEFAULT);
		this.mRotationCenterX = pRotationCenterX;
		this.mRotationCenterY = pRotationCenterY;
	}

	public RotationAtModifier(final float pDuration, final float pFromRotation, final float pToRotation, final float pRotationCenterX, final float pRotationCenterY, final IEntityModifierListener pEntityModifierListener, final IEaseFunction pEaseFunction) {
		super(pDuration, pFromRotation, pToRotation, pEntityModifierListener, pEaseFunction);
		this.mRotationCenterX = pRotationCenterX;
		this.mRotationCenterY = pRotationCenterY;
	}

	protected RotationAtModifier(final RotationAtModifier pRotationAtModifier) {
		super(pRotationAtModifier);
		this.mRotationCenterX = pRotationAtModifier.mRotationCenterX;
		this.mRotationCenterY = pRotationAtModifier.mRotationCenterY;
	}

	@Override
	public RotationAtModifier deepCopy(){
		return new RotationAtModifier(this);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void onManagedInitialize(final IEntity pEntity) {
		super.onManagedInitialize(pEntity);
		pEntity.setRotationCenter(this.mRotationCenterX, this.mRotationCenterY);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
>>>>>>> upstream/master:src/org/anddev/andengine/entity/modifier/RotationAtModifier.java

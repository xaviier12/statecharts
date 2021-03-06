/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.sct.model.sexec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.yakindu.base.base.BasePackage;
import org.yakindu.base.base.NamedElement;
import org.yakindu.base.types.AnnotatableElement;
import org.yakindu.base.types.Annotation;
import org.yakindu.base.types.ComplexType;
import org.yakindu.base.types.Declaration;
import org.yakindu.base.types.GenericElement;
import org.yakindu.base.types.PackageMember;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.TypeConstraint;
import org.yakindu.base.types.TypeParameter;
import org.yakindu.base.types.TypeSpecifier;
import org.yakindu.base.types.TypesPackage;
import org.yakindu.sct.model.sexec.ExecutionNode;
import org.yakindu.sct.model.sexec.Reaction;
import org.yakindu.sct.model.sexec.Sequence;
import org.yakindu.sct.model.sexec.SexecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getReactSequence <em>React Sequence</em>}</li>
 *   <li>{@link org.yakindu.sct.model.sexec.impl.ExecutionNodeImpl#getLocalReactSequence <em>Local React Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionNodeImpl extends MappedElementImpl implements ExecutionNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConstraint> constraint;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpecifier> superTypes;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> features;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reaction> reactions;

	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReactSequence() <em>React Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence reactSequence;

	/**
	 * The cached value of the '{@link #getLocalReactSequence() <em>Local React Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalReactSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence localReactSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SexecPackage.Literals.EXECUTION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getId() {
		return getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SexecPackage.EXECUTION_NODE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<TypeConstraint>(TypeConstraint.class, this, SexecPackage.EXECUTION_NODE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSpecifier> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectContainmentEList<TypeSpecifier>(TypeSpecifier.class, this, SexecPackage.EXECUTION_NODE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Declaration>(Declaration.class, this, SexecPackage.EXECUTION_NODE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<Reaction>(Reaction.class, this, SexecPackage.EXECUTION_NODE__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getReactSequence() {
		return reactSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactSequence(Sequence newReactSequence, NotificationChain msgs) {
		Sequence oldReactSequence = reactSequence;
		reactSequence = newReactSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__REACT_SEQUENCE, oldReactSequence, newReactSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactSequence(Sequence newReactSequence) {
		if (newReactSequence != reactSequence) {
			NotificationChain msgs = null;
			if (reactSequence != null)
				msgs = ((InternalEObject)reactSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SexecPackage.EXECUTION_NODE__REACT_SEQUENCE, null, msgs);
			if (newReactSequence != null)
				msgs = ((InternalEObject)newReactSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SexecPackage.EXECUTION_NODE__REACT_SEQUENCE, null, msgs);
			msgs = basicSetReactSequence(newReactSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__REACT_SEQUENCE, newReactSequence, newReactSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getLocalReactSequence() {
		return localReactSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalReactSequence(Sequence newLocalReactSequence, NotificationChain msgs) {
		Sequence oldLocalReactSequence = localReactSequence;
		localReactSequence = newLocalReactSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE, oldLocalReactSequence, newLocalReactSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalReactSequence(Sequence newLocalReactSequence) {
		if (newLocalReactSequence != localReactSequence) {
			NotificationChain msgs = null;
			if (localReactSequence != null)
				msgs = ((InternalEObject)localReactSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE, null, msgs);
			if (newLocalReactSequence != null)
				msgs = ((InternalEObject)newLocalReactSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE, null, msgs);
			msgs = basicSetLocalReactSequence(newLocalReactSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE, newLocalReactSequence, newLocalReactSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getAllFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOriginType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotationOfType(String typeName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SexecPackage.EXECUTION_NODE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__SUPER_TYPES:
				return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__REACTIONS:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case SexecPackage.EXECUTION_NODE__REACT_SEQUENCE:
				return basicSetReactSequence(null, msgs);
			case SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE:
				return basicSetLocalReactSequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SexecPackage.EXECUTION_NODE__NAME:
				return getName();
			case SexecPackage.EXECUTION_NODE__ID:
				return getId();
			case SexecPackage.EXECUTION_NODE__ANNOTATIONS:
				return getAnnotations();
			case SexecPackage.EXECUTION_NODE__CONSTRAINT:
				return getConstraint();
			case SexecPackage.EXECUTION_NODE__ABSTRACT:
				return isAbstract();
			case SexecPackage.EXECUTION_NODE__VISIBLE:
				return isVisible();
			case SexecPackage.EXECUTION_NODE__SUPER_TYPES:
				return getSuperTypes();
			case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS:
				return getTypeParameters();
			case SexecPackage.EXECUTION_NODE__FEATURES:
				return getFeatures();
			case SexecPackage.EXECUTION_NODE__REACTIONS:
				return getReactions();
			case SexecPackage.EXECUTION_NODE__SIMPLE_NAME:
				return getSimpleName();
			case SexecPackage.EXECUTION_NODE__REACT_SEQUENCE:
				return getReactSequence();
			case SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE:
				return getLocalReactSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SexecPackage.EXECUTION_NODE__NAME:
				setName((String)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends TypeConstraint>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeSpecifier>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Declaration>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends Reaction>)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__REACT_SEQUENCE:
				setReactSequence((Sequence)newValue);
				return;
			case SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE:
				setLocalReactSequence((Sequence)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SexecPackage.EXECUTION_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SexecPackage.EXECUTION_NODE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case SexecPackage.EXECUTION_NODE__CONSTRAINT:
				getConstraint().clear();
				return;
			case SexecPackage.EXECUTION_NODE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SexecPackage.EXECUTION_NODE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SexecPackage.EXECUTION_NODE__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case SexecPackage.EXECUTION_NODE__FEATURES:
				getFeatures().clear();
				return;
			case SexecPackage.EXECUTION_NODE__REACTIONS:
				getReactions().clear();
				return;
			case SexecPackage.EXECUTION_NODE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case SexecPackage.EXECUTION_NODE__REACT_SEQUENCE:
				setReactSequence((Sequence)null);
				return;
			case SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE:
				setLocalReactSequence((Sequence)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SexecPackage.EXECUTION_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SexecPackage.EXECUTION_NODE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case SexecPackage.EXECUTION_NODE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case SexecPackage.EXECUTION_NODE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case SexecPackage.EXECUTION_NODE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SexecPackage.EXECUTION_NODE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SexecPackage.EXECUTION_NODE__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case SexecPackage.EXECUTION_NODE__FEATURES:
				return features != null && !features.isEmpty();
			case SexecPackage.EXECUTION_NODE__REACTIONS:
				return reactions != null && !reactions.isEmpty();
			case SexecPackage.EXECUTION_NODE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case SexecPackage.EXECUTION_NODE__REACT_SEQUENCE:
				return reactSequence != null;
			case SexecPackage.EXECUTION_NODE__LOCAL_REACT_SEQUENCE:
				return localReactSequence != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case SexecPackage.EXECUTION_NODE__NAME: return BasePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AnnotatableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageMember.class) {
			switch (derivedFeatureID) {
				case SexecPackage.EXECUTION_NODE__ID: return TypesPackage.PACKAGE_MEMBER__ID;
				case SexecPackage.EXECUTION_NODE__ANNOTATIONS: return TypesPackage.PACKAGE_MEMBER__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case SexecPackage.EXECUTION_NODE__CONSTRAINT: return TypesPackage.TYPE__CONSTRAINT;
				case SexecPackage.EXECUTION_NODE__ABSTRACT: return TypesPackage.TYPE__ABSTRACT;
				case SexecPackage.EXECUTION_NODE__VISIBLE: return TypesPackage.TYPE__VISIBLE;
				case SexecPackage.EXECUTION_NODE__SUPER_TYPES: return TypesPackage.TYPE__SUPER_TYPES;
				default: return -1;
			}
		}
		if (baseClass == GenericElement.class) {
			switch (derivedFeatureID) {
				case SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS: return TypesPackage.GENERIC_ELEMENT__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ComplexType.class) {
			switch (derivedFeatureID) {
				case SexecPackage.EXECUTION_NODE__FEATURES: return TypesPackage.COMPLEX_TYPE__FEATURES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case BasePackage.NAMED_ELEMENT__NAME: return SexecPackage.EXECUTION_NODE__NAME;
				default: return -1;
			}
		}
		if (baseClass == AnnotatableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageMember.class) {
			switch (baseFeatureID) {
				case TypesPackage.PACKAGE_MEMBER__ID: return SexecPackage.EXECUTION_NODE__ID;
				case TypesPackage.PACKAGE_MEMBER__ANNOTATIONS: return SexecPackage.EXECUTION_NODE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPE__CONSTRAINT: return SexecPackage.EXECUTION_NODE__CONSTRAINT;
				case TypesPackage.TYPE__ABSTRACT: return SexecPackage.EXECUTION_NODE__ABSTRACT;
				case TypesPackage.TYPE__VISIBLE: return SexecPackage.EXECUTION_NODE__VISIBLE;
				case TypesPackage.TYPE__SUPER_TYPES: return SexecPackage.EXECUTION_NODE__SUPER_TYPES;
				default: return -1;
			}
		}
		if (baseClass == GenericElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.GENERIC_ELEMENT__TYPE_PARAMETERS: return SexecPackage.EXECUTION_NODE__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ComplexType.class) {
			switch (baseFeatureID) {
				case TypesPackage.COMPLEX_TYPE__FEATURES: return SexecPackage.EXECUTION_NODE__FEATURES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", visible: ");
		result.append(visible);
		result.append(", simpleName: ");
		result.append(simpleName);
		result.append(')');
		return result.toString();
	}

} //ExecutionNodeImpl

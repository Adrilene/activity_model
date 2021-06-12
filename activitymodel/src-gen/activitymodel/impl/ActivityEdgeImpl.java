/**
 */
package activitymodel.impl;

import activitymodel.ActivityEdge;
import activitymodel.ActivityNode;
import activitymodel.ActivitymodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.impl.ActivityEdgeImpl#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeImpl extends MinimalEObjectImpl.Container implements ActivityEdge {
	/**
	 * The cached value of the '{@link #getActivitynode() <em>Activitynode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitynode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode activitynode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitymodelPackage.Literals.ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getActivitynode() {
		if (activitynode != null && activitynode.eIsProxy()) {
			InternalEObject oldActivitynode = (InternalEObject) activitynode;
			activitynode = (ActivityNode) eResolveProxy(oldActivitynode);
			if (activitynode != oldActivitynode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE, oldActivitynode, activitynode));
			}
		}
		return activitynode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetActivitynode() {
		return activitynode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitynode(ActivityNode newActivitynode, NotificationChain msgs) {
		ActivityNode oldActivitynode = activitynode;
		activitynode = newActivitynode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE, oldActivitynode, newActivitynode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitynode(ActivityNode newActivitynode) {
		if (newActivitynode != activitynode) {
			NotificationChain msgs = null;
			if (activitynode != null)
				msgs = ((InternalEObject) activitynode).eInverseRemove(this,
						ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE, ActivityNode.class, msgs);
			if (newActivitynode != null)
				msgs = ((InternalEObject) newActivitynode).eInverseAdd(this,
						ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE, ActivityNode.class, msgs);
			msgs = basicSetActivitynode(newActivitynode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE,
					newActivitynode, newActivitynode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			if (activitynode != null)
				msgs = ((InternalEObject) activitynode).eInverseRemove(this,
						ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE, ActivityNode.class, msgs);
			return basicSetActivitynode((ActivityNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			return basicSetActivitynode(null, msgs);
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
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			if (resolve)
				return getActivitynode();
			return basicGetActivitynode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			setActivitynode((ActivityNode) newValue);
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
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			setActivitynode((ActivityNode) null);
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
		case ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE:
			return activitynode != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdgeImpl

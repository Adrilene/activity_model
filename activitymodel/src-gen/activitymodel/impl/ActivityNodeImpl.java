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
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.impl.ActivityNodeImpl#getActivityedge <em>Activityedge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeImpl extends MinimalEObjectImpl.Container implements ActivityNode {
	/**
	 * The cached value of the '{@link #getActivityedge() <em>Activityedge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityedge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge activityedge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitymodelPackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getActivityedge() {
		if (activityedge != null && activityedge.eIsProxy()) {
			InternalEObject oldActivityedge = (InternalEObject) activityedge;
			activityedge = (ActivityEdge) eResolveProxy(oldActivityedge);
			if (activityedge != oldActivityedge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE, oldActivityedge, activityedge));
			}
		}
		return activityedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetActivityedge() {
		return activityedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityedge(ActivityEdge newActivityedge, NotificationChain msgs) {
		ActivityEdge oldActivityedge = activityedge;
		activityedge = newActivityedge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE, oldActivityedge, newActivityedge);
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
	public void setActivityedge(ActivityEdge newActivityedge) {
		if (newActivityedge != activityedge) {
			NotificationChain msgs = null;
			if (activityedge != null)
				msgs = ((InternalEObject) activityedge).eInverseRemove(this,
						ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE, ActivityEdge.class, msgs);
			if (newActivityedge != null)
				msgs = ((InternalEObject) newActivityedge).eInverseAdd(this,
						ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE, ActivityEdge.class, msgs);
			msgs = basicSetActivityedge(newActivityedge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE,
					newActivityedge, newActivityedge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			if (activityedge != null)
				msgs = ((InternalEObject) activityedge).eInverseRemove(this,
						ActivitymodelPackage.ACTIVITY_EDGE__ACTIVITYNODE, ActivityEdge.class, msgs);
			return basicSetActivityedge((ActivityEdge) otherEnd, msgs);
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
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			return basicSetActivityedge(null, msgs);
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
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			if (resolve)
				return getActivityedge();
			return basicGetActivityedge();
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
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			setActivityedge((ActivityEdge) newValue);
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
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			setActivityedge((ActivityEdge) null);
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
		case ActivitymodelPackage.ACTIVITY_NODE__ACTIVITYEDGE:
			return activityedge != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeImpl

/**
 */
package activitymodel.impl;

import activitymodel.ActivityDiagram;
import activitymodel.ActivityEdge;
import activitymodel.ActivityNode;
import activitymodel.ActivitymodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.impl.ActivityDiagramImpl#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link activitymodel.impl.ActivityDiagramImpl#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends MinimalEObjectImpl.Container implements ActivityDiagram {
	/**
	 * The cached value of the '{@link #getActivityedge() <em>Activityedge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityedge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> activityedge;

	/**
	 * The cached value of the '{@link #getActivitynode() <em>Activitynode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitynode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> activitynode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getActivityedge() {
		if (activityedge == null) {
			activityedge = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this,
					ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE);
		}
		return activityedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getActivitynode() {
		if (activitynode == null) {
			activitynode = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this,
					ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE);
		}
		return activitynode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			return ((InternalEList<?>) getActivityedge()).basicRemove(otherEnd, msgs);
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			return ((InternalEList<?>) getActivitynode()).basicRemove(otherEnd, msgs);
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
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			return getActivityedge();
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			return getActivitynode();
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
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			getActivityedge().clear();
			getActivityedge().addAll((Collection<? extends ActivityEdge>) newValue);
			return;
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			getActivitynode().clear();
			getActivitynode().addAll((Collection<? extends ActivityNode>) newValue);
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
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			getActivityedge().clear();
			return;
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			getActivitynode().clear();
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
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			return activityedge != null && !activityedge.isEmpty();
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			return activitynode != null && !activitynode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDiagramImpl

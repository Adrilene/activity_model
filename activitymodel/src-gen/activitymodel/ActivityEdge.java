/**
 */
package activitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.ActivityEdge#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @see activitymodel.ActivitymodelPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitynode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitymodel.ActivityNode#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitynode</em>' reference.
	 * @see #setActivitynode(ActivityNode)
	 * @see activitymodel.ActivitymodelPackage#getActivityEdge_Activitynode()
	 * @see activitymodel.ActivityNode#getActivityedge
	 * @model opposite="activityedge"
	 * @generated
	 */
	ActivityNode getActivitynode();

	/**
	 * Sets the value of the '{@link activitymodel.ActivityEdge#getActivitynode <em>Activitynode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitynode</em>' reference.
	 * @see #getActivitynode()
	 * @generated
	 */
	void setActivitynode(ActivityNode value);

} // ActivityEdge

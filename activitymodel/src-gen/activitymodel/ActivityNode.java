/**
 */
package activitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.ActivityNode#getActivityedge <em>Activityedge</em>}</li>
 * </ul>
 *
 * @see activitymodel.ActivitymodelPackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Activityedge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitymodel.ActivityEdge#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityedge</em>' reference.
	 * @see #setActivityedge(ActivityEdge)
	 * @see activitymodel.ActivitymodelPackage#getActivityNode_Activityedge()
	 * @see activitymodel.ActivityEdge#getActivitynode
	 * @model opposite="activitynode"
	 * @generated
	 */
	ActivityEdge getActivityedge();

	/**
	 * Sets the value of the '{@link activitymodel.ActivityNode#getActivityedge <em>Activityedge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activityedge</em>' reference.
	 * @see #getActivityedge()
	 * @generated
	 */
	void setActivityedge(ActivityEdge value);

} // ActivityNode

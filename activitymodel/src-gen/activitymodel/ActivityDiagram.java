/**
 */
package activitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitymodel.ActivityDiagram#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link activitymodel.ActivityDiagram#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @see activitymodel.ActivitymodelPackage#getActivityDiagram()
 * @model
 * @generated
 */
public interface ActivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Activityedge</b></em>' containment reference list.
	 * The list contents are of type {@link activitymodel.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityedge</em>' containment reference list.
	 * @see activitymodel.ActivitymodelPackage#getActivityDiagram_Activityedge()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getActivityedge();

	/**
	 * Returns the value of the '<em><b>Activitynode</b></em>' containment reference list.
	 * The list contents are of type {@link activitymodel.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitynode</em>' containment reference list.
	 * @see activitymodel.ActivitymodelPackage#getActivityDiagram_Activitynode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getActivitynode();

} // ActivityDiagram

/**
 */
package yaml_diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yaml_diagram.Key#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see yaml_diagram.Yaml_diagramPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link yaml_diagram.Value#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see yaml_diagram.Yaml_diagramPackage#getKey_Value()
	 * @see yaml_diagram.Value#getKey
	 * @model opposite="key"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link yaml_diagram.Key#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Key

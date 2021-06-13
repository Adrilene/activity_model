/**
 */
package yaml_diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yaml_diagram.Value#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see yaml_diagram.Yaml_diagramPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends yaml_diagram.Object, Array, Data {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link yaml_diagram.Key#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Key)
	 * @see yaml_diagram.Yaml_diagramPackage#getValue_Key()
	 * @see yaml_diagram.Key#getValue
	 * @model opposite="value"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link yaml_diagram.Value#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

} // Value

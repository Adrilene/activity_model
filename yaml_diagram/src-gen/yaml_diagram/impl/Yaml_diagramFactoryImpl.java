/**
 */
package yaml_diagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import yaml_diagram.Array;
import yaml_diagram.Data;
import yaml_diagram.Key;
import yaml_diagram.Value;
import yaml_diagram.Yaml_diagramFactory;
import yaml_diagram.Yaml_diagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Yaml_diagramFactoryImpl extends EFactoryImpl implements Yaml_diagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Yaml_diagramFactory init() {
		try {
			Yaml_diagramFactory theYaml_diagramFactory = (Yaml_diagramFactory) EPackage.Registry.INSTANCE
					.getEFactory(Yaml_diagramPackage.eNS_URI);
			if (theYaml_diagramFactory != null) {
				return theYaml_diagramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Yaml_diagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yaml_diagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Yaml_diagramPackage.OBJECT:
			return createObject();
		case Yaml_diagramPackage.ARRAY:
			return createArray();
		case Yaml_diagramPackage.VALUE:
			return createValue();
		case Yaml_diagramPackage.KEY:
			return createKey();
		case Yaml_diagramPackage.DATA:
			return createData();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yaml_diagram.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yaml_diagramPackage getYaml_diagramPackage() {
		return (Yaml_diagramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Yaml_diagramPackage getPackage() {
		return Yaml_diagramPackage.eINSTANCE;
	}

} //Yaml_diagramFactoryImpl

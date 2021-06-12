/**
 */
package activitymodel.provider;

import activitymodel.ActivityDiagram;
import activitymodel.ActivitymodelFactory;
import activitymodel.ActivitymodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link activitymodel.ActivityDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE);
			childrenFeatures.add(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActivityDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDiagram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ActivityDiagram_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ActivityDiagram.class)) {
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
		case ActivitymodelPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE,
				ActivitymodelFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createActivityNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createFinalNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add(createChildParameter(ActivitymodelPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				ActivitymodelFactory.eINSTANCE.createDecisionNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ActivitymodelEditPlugin.INSTANCE;
	}

}

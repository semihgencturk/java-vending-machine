package view.productManagementView;

import controller.definedProducts.DefinedProductsLister;

public class ProductManagementListerView {
    private static ProductManagementListerView self = new ProductManagementListerView();
    public static ProductManagementListerView getInstance() { return self; }

    public void productManagementListerViewStarter() {
        System.out.println("List of Defined Vending Machines:");
        DefinedProductsLister.getInstance().definedProductsListerStarter();
    }
}

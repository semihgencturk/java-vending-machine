package controller.definedProducts;

import static model.DefinedProducts.definedProductsList;

public class DefinedProductsLister {
    private static DefinedProductsLister self = new DefinedProductsLister();
    public static DefinedProductsLister getInstance() { return self; }

    public void definedProductsListerStarter() {
        System.out.println(definedProductsList);
    }
}

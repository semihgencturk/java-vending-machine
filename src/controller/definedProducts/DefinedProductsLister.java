package controller.definedProducts;

import static model.DefinedProductList.definedProductList;

public class DefinedProductsLister {
    private static DefinedProductsLister self = new DefinedProductsLister();
    public static DefinedProductsLister getInstance() { return self; }

    public void definedProductsListerStarter() {
        System.out.println(definedProductList);
    }
}

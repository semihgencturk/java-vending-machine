package controller.definedProducts;

import static model.DefinedProductList.definedProductList;

public class DefinedProductsRemover {
    private static DefinedProductsRemover self = new DefinedProductsRemover();
    public static DefinedProductsRemover getInstance() { return self; }

    public void definedProductsRemoverStarter(int productIndex) {
        definedProductList.remove(productIndex);
    }
}

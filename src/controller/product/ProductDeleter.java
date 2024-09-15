package controller.product;

import controller.definedProducts.DefinedProductsRemover;

public class ProductDeleter {
    private static ProductDeleter self = new ProductDeleter();
    public static ProductDeleter getInstance() { return self; }

    public void productDeleterStarter(int productIndex) {
        DefinedProductsRemover.getInstance().definedProductsRemoverStarter(productIndex);
    }
}

package controller.definedProducts;

import model.Product;
import static model.DefinedProducts.definedProductsList;

public class DefinedProductsRemover {
    private static DefinedProductsRemover self = new DefinedProductsRemover();
    public static DefinedProductsRemover getInstance() { return self; }

    public void definedProductsRemoverStarter(Product product) {
        definedProductsList.remove(product);
    }
}

package controller.definedProducts;

import model.Product;
import static model.DefinedProducts.definedProductsList;

public class DefinedProductsAdder {
    private static DefinedProductsAdder self = new DefinedProductsAdder();
    public static DefinedProductsAdder getInstance() { return self; }

    public void definedProductsAdderStarter(Product product) {
        definedProductsList.add(product);
    }
}

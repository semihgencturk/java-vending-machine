package controller.product;

import static model.DefinedProductList.definedProductList;

public class ProductDetailer {
    private static ProductDetailer self = new ProductDetailer();
    public static ProductDetailer getInstance() { return self; }

    public void productDetailerStarter(int productIndex) {
        System.out.println(definedProductList.get(productIndex));
    }
}

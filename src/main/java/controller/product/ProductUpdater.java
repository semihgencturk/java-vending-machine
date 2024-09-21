package controller.product;

import model.Product;

public class ProductUpdater {
    private static ProductUpdater self = null;
    public static ProductUpdater getInstance() {
        if (self == null) {
            self = new ProductUpdater();
        }
        return self;
    }

    public void productIdUpdater(Product product, int productId) {
        product.setProductId(productId);
    }
    public void productNameUpdater(Product product, String productName) {
        product.setProductName(productName);
    }
    public void productPriceUpdater(Product product, Double productPrice) {
        product.setProductPrice(productPrice);
    }
}

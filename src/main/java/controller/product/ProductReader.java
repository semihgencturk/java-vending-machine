package controller.product;

import model.Product;

public class ProductReader {
    private static ProductReader self = null;
    public static ProductReader getInstance() {
        if (self == null) {
            self = new ProductReader();
        }
        return self;
    }

    public int productIdReader(Product product) {
        return product.getProductId();
    }
    public String productNameReader(Product product) {
        return product.getProductName();
    }
    public Double productPriceReader(Product product) {
        return product.getProductPrice();
    }
}



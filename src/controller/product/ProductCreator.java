package controller.product;

import model.Product;

public class ProductCreator {
    private static ProductCreator self = new ProductCreator();
    public static ProductCreator getInstance() { return self; }

    public Product productCreatorStarter() {
        return Product.getInstance();
    }

    public Product productCreatorStarter (int productId, String productName, Double productPrice){
        Product product = Product.getInstance();

        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);

        return product;
    }
}

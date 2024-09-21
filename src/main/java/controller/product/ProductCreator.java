package controller.product;

import model.Product;
import static app_data.ProductTable.productTable;

public class ProductCreator {
    private static ProductCreator self = null;
    public static ProductCreator getInstance() {
        if (self == null) {
            self = new ProductCreator();
        }
        return self;
    }

    public void productCreator() {
        Product product = new Product();
        productTable.add(product);
    }

    public void productCreator(int productId, String productName, Double productPrice){
        Product product = new Product();

        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);

        productTable.add(product);
    }
}

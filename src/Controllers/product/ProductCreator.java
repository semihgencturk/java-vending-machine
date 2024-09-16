package Controllers.product;

import Models.Product;
import static App_data.ProductTable.productTable;

public class ProductCreator {
    private static ProductCreator self = new ProductCreator();
    public static ProductCreator getInstance() { return self; }

    public void productCreator() {
        productTable.add(Product.getInstance());
    }

    public void productCreator(int productId, String productName, Double productPrice){
        Product product = Product.getInstance();

        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);

        productTable.add(product);
    }
}

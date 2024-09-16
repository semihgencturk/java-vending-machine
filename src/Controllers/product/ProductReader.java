package Controllers.product;

import Models.Product;
import static App_data.ProductTable.productTable;

public class ProductReader {
    private static ProductReader self = new ProductReader();
    public static ProductReader getInstance() { return self; }

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



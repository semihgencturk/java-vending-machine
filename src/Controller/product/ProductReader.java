package Controller.product;

import Model.Product;
import static App_data.ProductTable.productTable;

public class ProductReader {
    private static ProductReader self = new ProductReader();
    public static ProductReader getInstance() { return self; }

    public Product productReader(int productIndex) {
        return productTable.get(productIndex);
    }
}

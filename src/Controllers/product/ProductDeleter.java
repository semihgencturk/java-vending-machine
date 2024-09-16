package Controllers.product;

import static App_data.ProductTable.productTable;

public class ProductDeleter {
    private static ProductDeleter self = new ProductDeleter();
    public static ProductDeleter getInstance() { return self; }

    public void productDeleter(int productIndex) {
        productTable.remove(productIndex);
    }
}

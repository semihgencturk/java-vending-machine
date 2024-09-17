package Controllers.product;

import static App_data.ProductTable.productTable;

public class ProductDeleter {
    private static ProductDeleter self = null;
    public static ProductDeleter getInstance() {
        if (self == null) {
            self = new ProductDeleter();
        }
        return self;
    }

    public void productDeleter(int productIndex) {
        productTable.remove(productIndex);
    }
}

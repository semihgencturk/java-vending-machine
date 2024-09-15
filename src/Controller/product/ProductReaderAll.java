package Controller.product;

import Model.Product;
import java.util.ArrayList;
import static App_data.ProductTable.productTable;

public class ProductReaderAll {
    private static ProductReaderAll self = new ProductReaderAll();
    public static ProductReaderAll getInstance() { return self; }

    public ArrayList<Product> productReaderAll() {
        return productTable;
    }
}

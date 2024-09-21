package script;

import controller.product.ProductCreator;

public class AddToProductTable {
    private static AddToProductTable self = null;
    public static AddToProductTable getInstance() {
        if (self == null) {
            self = new AddToProductTable();
        }
        return self;
    }

    public void addToProductTable() {
        ProductCreator productCreator = ProductCreator.getInstance();

        productCreator.productCreator(1, "myProduct1", 1.99);
        productCreator.productCreator(2, "myProduct2", 2.99);
        productCreator.productCreator(3, "myProduct3", 3.99);
        productCreator.productCreator(4, "myProduct4", 4.99);
        productCreator.productCreator(5, "myProduct5", 5.99);
    }
}

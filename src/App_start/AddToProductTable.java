package App_start;

import Controllers.product.ProductCreator;

public class AddToProductTable {
    private static AddToProductTable self = new AddToProductTable();
    public static AddToProductTable getInstance() { return self; }

    public void addToProductTable() {
        ProductCreator.getInstance().productCreator(1, "myProduct1", 1.99);
        ProductCreator.getInstance().productCreator(2, "myProduct2", 2.99);
        ProductCreator.getInstance().productCreator(3, "myProduct3", 3.99);
        ProductCreator.getInstance().productCreator(4, "myProduct4", 4.99);
        ProductCreator.getInstance().productCreator(5, "myProduct5", 5.99);
    }
}

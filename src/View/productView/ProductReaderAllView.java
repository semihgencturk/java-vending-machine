package View.productView;

import Controller.product.ProductReaderAll;

public class ProductReaderAllView {
    private static ProductReaderAllView self = new ProductReaderAllView();
    public static ProductReaderAllView getInstance() { return self; }

    public void productReaderAllView() {
        System.out.println("List of Defined Vending Machines:");
        System.out.println(ProductReaderAll.getInstance().productReaderAll());
    }
}

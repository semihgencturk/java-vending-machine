package View.productView;

import Controller.product.ProductReader;
import java.util.Scanner;

public class ProductReaderView {
    private static ProductReaderView self = new ProductReaderView();
    public static ProductReaderView getInstance() { return self; }

    public void productReaderView() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int productIndex = myScanner.nextInt();

        System.out.println(ProductReader.getInstance().productReader(productIndex));
    }
}

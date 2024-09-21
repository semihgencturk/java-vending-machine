package view.productView;

import controller.product.ProductReader;
import model.Product;
import java.util.Scanner;
import static app_data.ProductTable.productTable;

public class ProductReaderView {
    private static ProductReaderView self = null;
    public static ProductReaderView getInstance() {
        if (self == null) {
            self = new ProductReaderView();
        }
        return self;
    }

    public void productReaderView() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the vending machine you want to see its details:");
        int productIndex = myScanner.nextInt();
        Product product = productTable.get(productIndex);

        ProductReader productReader = ProductReader.getInstance();

        System.out.println("1-productId: " + productReader.productIdReader(product));
        System.out.println("2-productName: " + productReader.productNameReader(product));
        System.out.println("3-productPrice: " + productReader.productPriceReader(product));
    }
}

package view.productView;

import controller.product.ProductReader;
import model.Product;
import static app_data.ProductTable.productTable;

public class ProductReaderAllView {
    private static ProductReaderAllView self = null;
    public static ProductReaderAllView getInstance() {
        if (self == null) {
            self = new ProductReaderAllView();
        }
        return self;
    }

    public void productReaderAllView() {
        System.out.println("List of Defined Products and their details:");

        ProductReader productReader = ProductReader.getInstance();

        for(Product product : productTable) {
            System.out.println("1-productId: " + productReader.productIdReader(product));
            System.out.println("2-productName: " + productReader.productNameReader(product));
            System.out.println("3-productPrice: " + productReader.productPriceReader(product));
        }
    }
}

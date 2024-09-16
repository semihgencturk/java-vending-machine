package Views.productView;

import Controllers.product.ProductReader;
import Models.Product;

import static App_data.ProductTable.productTable;

public class ProductReaderAllView {
    private static ProductReaderAllView self = new ProductReaderAllView();
    public static ProductReaderAllView getInstance() { return self; }

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

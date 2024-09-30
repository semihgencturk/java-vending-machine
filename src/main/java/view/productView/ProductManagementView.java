package view.productView;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductManagementView {
    public void getProductManagementView() throws SQLException {
        ProductCreatorView productCreatorView = new ProductCreatorView();
        ProductReaderView productReaderView = new ProductReaderView();
        ProductUpdaterView productUpdaterView = new ProductUpdaterView();
        ProductDeleterView productDeleterView = new ProductDeleterView();

        // List of operations for admin in the product view
        System.out.println("You can manage the product in there. Please select the operation: (Expected integer - Example entry: 4)");
        System.out.println("1- Create A New Product");
        System.out.println("2- List Of Products");
        System.out.println("3- Detail Of A Product");
        System.out.println("4- Update A Product");
        System.out.println("5- Delete A Product");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        // Route the related page according to selected operation
        switch (selectedOption) {
            case 1:
                productCreatorView.createProduct();
                break;
            case 2:
                productReaderView.printProducts();
                break;
            case 3:
                productReaderView.printProductById();
                break;
            case 4:
                productUpdaterView.updateProduct();
                break;
            case 5:
                productDeleterView.deleteProduct();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}

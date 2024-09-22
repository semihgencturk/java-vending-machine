package view.productView;

import java.util.Scanner;

public class ProductView {
    public void getProductView() {
        ProductCreatorView productCreatorView = new ProductCreatorView();
        ProductReaderView productReaderView = new ProductReaderView();
        ProductUpdaterView productUpdaterView = new ProductUpdaterView();
        ProductDeleterView productDeleterView = new ProductDeleterView();

        System.out.println("You can manage the product in there. Please select the operation:");
        System.out.println("3- Create A New Product");
        System.out.println("1- List Of Products");
        System.out.println("2- Detail Of A Product");
        System.out.println("4- Update A Product");
        System.out.println("5- Delete A Product");

        Scanner myScanner = new Scanner(System.in);
        int selectedOption = myScanner.nextInt();

        switch (selectedOption) {
            case 1:
                productCreatorView.createProduct();
                break;
            case 2:
                productReaderView.getProducts();
                break;
            case 3:
                productReaderView.getProductById();
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

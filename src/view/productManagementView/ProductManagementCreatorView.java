package view.productManagementView;

import controller.definedDenominations.DefinedDenominationsAdder;
import controller.definedProducts.DefinedProductsAdder;
import controller.denomination.DenominationCreator;
import controller.product.ProductCreator;
import view.denominationManagementView.DenominationManagementCreatorView;

import java.util.Scanner;

public class ProductManagementCreatorView {
    private static ProductManagementCreatorView self = new ProductManagementCreatorView();
    public static ProductManagementCreatorView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void productManagementCreatorViewStarter() {

        System.out.println("Enter the Denomination Id");
        int productId = myScanner.nextInt();

        System.out.println("Enter the Denomination Currency");
        String productName = myScanner.nextLine();

        System.out.println("Enter the Denomination Amount");
        Double productPrice = myScanner.nextDouble();

        DefinedProductsAdder.getInstance().definedProductsAdderStarter(ProductCreator.getInstance().productCreatorStarter(productId, productName, productPrice));

    }
}

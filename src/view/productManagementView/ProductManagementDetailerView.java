package view.productManagementView;

import controller.product.ProductDetailer;

import java.util.Scanner;

public class ProductManagementDetailerView {
    private static ProductManagementDetailerView self = new ProductManagementDetailerView();
    public static ProductManagementDetailerView getInstance() { return self; }

    public void productManagementDetailerViewStarter() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int product = myScanner.nextInt();

        ProductDetailer.getInstance().productDetailerStarter(product);
    }
}

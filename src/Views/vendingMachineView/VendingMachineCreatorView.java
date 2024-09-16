package Views.vendingMachineView;

import Controllers.vendingMachine.VendingMachineCreator;
import Models.Denomination;
import Models.Product;
import java.util.ArrayList;
import java.util.Scanner;
import static App_data.DenominationTable.denominationTable;
import static App_data.ProductTable.productTable;

public class VendingMachineCreatorView {
    private static VendingMachineCreatorView self = new VendingMachineCreatorView();
    public static VendingMachineCreatorView getInstance() { return self; }

    Scanner myScanner = new Scanner(System.in);

    public void vendingMachineCreatorView() {
        System.out.println("Enter the Vending Machine Id");
        int vendingMachineId = myScanner.nextInt();

        System.out.println("Enter the Vending Machine Name");
        String vendingMachineName = myScanner.nextLine();

        System.out.println("Enter the totalProductStorageUnitNumber");
        int totalProductStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the productStorageUnitCapacity");
        int productStorageUnitCapacity = myScanner.nextInt();

        System.out.println("Enter the denominationStorageUnitCapacity");
        int totalDenominationStorageUnitNumber = myScanner.nextInt();

        System.out.println("Enter the totalDenominationStorageUnitNumber");
        int denominationStorageUnitCapacity = myScanner.nextInt();

        ArrayList<Denomination> denominationsOnUsage = new ArrayList<Denomination>();
        ArrayList<Integer> denominationsOnUsageAvailability = new ArrayList<Integer>();
        for(int denominationStorageUnit=0; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++){
            System.out.println("Enter the denomination on usage for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationIndex = myScanner.nextInt();
            denominationsOnUsage.add(denominationTable.get(denominationIndex));
            System.out.println("Enter the denomination availability for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int denominationPiece = myScanner.nextInt();
            denominationsOnUsageAvailability.add(denominationPiece);
        }

        ArrayList<Product> productsOnSale = new ArrayList<Product>();
        ArrayList<Integer> productsOnSaleAvailability = new ArrayList<Integer>();
        for(int denominationStorageUnit=0; denominationStorageUnit <= totalDenominationStorageUnitNumber; denominationStorageUnit++){
            System.out.println("Enter the product on sale for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int productIndex = myScanner.nextInt();
            productsOnSale.add(productTable.get(productIndex));
            System.out.println("Enter the product availability for unit" + denominationStorageUnit + "of" + totalDenominationStorageUnitNumber);
            int productPiece = myScanner.nextInt();
            productsOnSaleAvailability.add(productPiece);
        }

       VendingMachineCreator.getInstance().vendingMachineCreator(vendingMachineId, vendingMachineName, totalProductStorageUnitNumber, productStorageUnitCapacity, totalDenominationStorageUnitNumber, denominationStorageUnitCapacity, denominationsOnUsage, denominationsOnUsageAvailability, productsOnSale, productsOnSaleAvailability);
    }
}
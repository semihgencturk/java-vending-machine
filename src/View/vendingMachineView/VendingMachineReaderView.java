package View.vendingMachineView;

import Controller.vendingMachine.VendingMachineReader;
import java.util.Scanner;

public class VendingMachineReaderView {
    private static VendingMachineReaderView self = new VendingMachineReaderView();
    public static VendingMachineReaderView getInstance() { return self; }

    public void vendingMachineReaderView(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the vending machine you want to see its details:");
        int vendingMachineIndex = myScanner.nextInt();

        System.out.println(VendingMachineReader.getInstance().vendingMachineReader(vendingMachineIndex));
    }
}

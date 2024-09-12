package controller.vendingMachine;
import model.VendingMachine;

public class VendingMachineCreator {
    private static VendingMachineCreator self = new VendingMachineCreator();
    public static VendingMachineCreator getInstance() { return self; }

    public VendingMachine definingNewVendingMachine() {
            return VendingMachine.getInstance();
    }
}


//Scanner myScanner = new Scanner(System.in);
//        System.out.println("Give a name to new machine");
//String myNewMachineName = myScanner.nextLine();
//        System.out.println(myNewMachineName);
//myNewMachineName. = VendingMachine.getInstance();
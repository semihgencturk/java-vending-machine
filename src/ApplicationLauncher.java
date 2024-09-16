import App_start.AddToDenominationTable;
import App_start.AddToProductTable;
import App_start.AddToVendingMachineTable;
import Views.GreetingView;
import Views.vendingMachineView.VendingMachineReaderAllView;

public class ApplicationLauncher {
    public static void main(String[] args) {

        AddToDenominationTable.getInstance().addToDenominationTable();
        AddToProductTable.getInstance().addToProductTable();
        AddToVendingMachineTable.getInstance().addToVendingMachineTable();

        GreetingView.getInstance().greetingView();
    }
}

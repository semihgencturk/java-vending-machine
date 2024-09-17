import Scripts.AddToDenominationTable;
import Scripts.AddToProductTable;
import Scripts.AddToVendingMachineTable;
import Views.GreetingView;

public class ApplicationLauncher {
    public static void main(String[] args) {

        AddToDenominationTable.getInstance().addToDenominationTable();
        AddToProductTable.getInstance().addToProductTable();
        AddToVendingMachineTable.getInstance().addToVendingMachineTable();

        GreetingView.getInstance().greetingView();
    }
}

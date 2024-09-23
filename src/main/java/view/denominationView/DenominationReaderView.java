package view.denominationView;

import controller.DenominationController;
import model.Denomination;
import java.util.Scanner;

public class DenominationReaderView {
    DenominationController denominationController = new DenominationController();

    public void getDenominationById() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the vending machine id you want to see its details:");
        int denominationId = myScanner.nextInt();

        printDenomination(denominationController.getDenominationById(denominationId));
    }

    public void getDenominations() {
        for (Denomination denomination : denominationController.getDenominations()) {
            printDenomination(denomination);
        }
    }

    private void printDenomination(Denomination denomination) {
        System.out.println("1-denominationId: " + denomination.getDenominationId());
        System.out.println("2-denominationCurrency: " + denomination.getDenominationCurrency());
        System.out.println("3-denominationAmount: " + denomination.getDenominationAmount());
    }
}



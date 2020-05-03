package WzorzecFacade;

import java.util.Scanner;

public class AtmMachine {
    private BankFacade bankFacade = new BankFacade();
    private static AtmMachine atmMachine = new AtmMachine();
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        atmMachine.start();
    }

    private void start() {
        System.out.println(">>>> Welcome to ATM <<<<");
        System.out.println("Enter your PIN: ");
        int pin = in.nextInt();
        in.nextLine();

        if (bankFacade.verify(pin)) {
            System.out.println("Authorization succeeded!");
            atmMachine.printMenu();
        } else {
            System.out.println("Authorization failed!");
            atmMachine.end();
        }
    }

    private void end() {
        System.out.println("Thank you. Welcome again.");
    }

    private void printMenu() {
        System.out.println(">> MENU <<");
        System.out.println("1 : check account amount");
        System.out.println("2 : withdraw amount");
        System.out.println("3 : back to Menu");
        System.out.println("4 : EXIT");
        System.out.println("Enter your choice: ");
        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter your PIN: ");
                int pin = in.nextInt();
                in.nextLine();
                System.out.println(bankFacade.checkAccountAmount(pin));
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                int amount = in.nextInt();
                in.nextLine();
                System.out.println(bankFacade.withdrawAmount(amount));
                break;
            case 3:
                atmMachine.printMenu();
                break;
            case 4:
                atmMachine.end();
                break;
            default:
                System.out.println("Illegal input!");
                atmMachine.printMenu();
        }
    }
}

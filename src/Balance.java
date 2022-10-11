import java.util.Scanner;

public class Balance {

    Scanner sc = new Scanner(System.in);

    private int balance_id;
    private int balance_amount;
    private int balance_customer_id;
    private String balance_description;

    void addBalance() {
        long amount = 0;
        System.out.println("Enter amount you want to add: ");
        amount = sc.nextLong();
        balance_amount += amount;
        System.out.println("Current balance after deposit: " +balance_amount);

    }

    void editBalance() {
        //TODO
    }

    void deleteBalance() {
        //TODO
    }

    void searchBalance() {
        //TODO
    }
}


import java.util.Scanner;

public class Balance {

    Scanner sc = new Scanner(System.in);

    private boolean balance_id;
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
        while(balance_id) {
            long amount = 0;
            while (balance_amount > 0) {
                System.out.println("Enter the amount you want to withdraw: "); //? nefunguje, neviem preco zatial
                amount = sc.nextLong(); //??
                balance_amount -= amount;
                System.out.println("Your current balance is: " + balance_amount);
            }
        }
    }

    void deleteBalance() {
        //TODO
    }

    void searchBalance() {
        //TODO
    }
}


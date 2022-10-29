import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //private static double amount;
   // private static boolean flag = false;



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Menu starts from here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the option for the operation you need: ");
        System.out.println("1 > Withdraw");
        System.out.println("2 > Check balance");
        System.out.println("3 > Deposit money");
        System.out.println("4 > Other");
        System.out.println("5 > Quit");
        Accounts accounts = null;
        Balance balance = null;

      //  while (true) {
            System.out.println("> ");
            String choice = input.next();
            //switch (choice) {
               // case "1":
                    //withdraw
                    System.out.println("Enter the amount you wan to withdrawn: ");
                    amount = scan.nextDouble();
                    assert false;
                    if(amount > balance.checkBalance() && amount <=0) {
                        System.out.println("You can not withdraw that amount of money.");
                   // } else if (amount <= balance.checkBalance()) {
                        //if(flag)
                    }

            }
        }
    }
}

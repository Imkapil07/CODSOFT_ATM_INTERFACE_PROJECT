
import java.util.Scanner;

import static java.lang.System.exit;

class ATM_Machine{
   float balance;
   int PIN = 8979;

   //   It is used to check Pin valid or invalid.
   public void checkPin(){
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter your pin:");
       int user_pin = sc.nextInt();

       if(user_pin == PIN)
           menu();
       else
           System.out.println("Enter the valid pin!!");
           checkPin();
   }
   // Creation of Menu method for user's choice
   public void menu(){
       System.out.println("\n-------OUR SERVICES-------");
       System.out.println("1. Check A/C Balance");
       System.out.println("2. Deposit Money");
       System.out.println("3. Withdraw Money");
       System.out.println("4. Exit");

       System.out.println("\nEnter Your Choice: ");
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();

       switch (n){
           case 1: check_Balance();break;
           case 2: deposit_Money();break;
           case 3: withdraw_Money();break;
           case 4: System.out.println("_______THANKING YOU FOR CONNECTING WITH US__________\n");
                   exit(1);
           default: System.out.println("\n\nEnter the valid Choice..!");
       }
   }
  // It is used to check amount available in your bank account
      public void check_Balance(){
        System.out.println("Your Balance: "+balance);
        System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
        Scanner sc= new Scanner(System.in);
        int lastChoice=sc.nextInt();

        if(lastChoice == 0)
            System.out.println("\n\n_______THANKING YOU FOR CONNECTING WITH US__________");
        else if(lastChoice == 1)
            menu();
        else
            System.out.println("Enter the valid input..!");
    }

    //....for deposti the money...
    public void deposit_Money(){
        System.out.println("Enter the Amount to Deposit:");
        Scanner sc= new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount<0){
            System.out.println("Invalid input..");
            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n_______THANKING YOU FOR CONNECTING WITH US__________");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }
        else{
            balance = balance + amount;
            System.out.println("<<Money deposited succesfully>>");

            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n_______THANKING YOU FOR CONNECTING WITH US__________");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }

    }

    //.....It is used to withdraw money option....
    public void withdraw_Money(){
        System.out.println("\nEnter the amount to be Withdraw:");
        Scanner sc =new Scanner(System.in);
        int amount =sc.nextInt();

        if(amount<0){
            System.out.println("Invalid input..");
            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n_______THANKING YOU FOR CONNECTING WITH US__________");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }
        else{
            balance = balance - amount;
            System.out.println("<<Money Withdrawal succesfully>>");

            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n_______THANKING YOU FOR CONNECTING WITH US__________");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }

    }

}


public class Atm_Interface {
    public static void main(String[] args) {
        System.out.println("\n______WELCOME TO YOUR BANK ACCOUNT_______\n");
        ATM_Machine ob = new ATM_Machine();
        ob.checkPin();

    }
}

import java.util.*;

public class ATM {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your account number");
        int ac = 9548;
        int pass = 1234;
        int your_ac = sc.nextInt();
        int Account = 5000;


        if (ac == your_ac) {
            System.out.println("Enter your password");
            int your_pass = sc.nextInt();

            // LOOP FOR PASS

            if (pass == your_pass) {
                System.out.println("1 Account balance");
                System.out.println("2 Withdrawal Cash");
                System.out.println("3 Deposit money");
                int a = sc.nextInt();   
                if (a == 1) {
                    System.out.println(Account);
                }
                if (a == 2) {
                    System.out.println("Enter ammount");
                    int cash = sc.nextInt();
                    if(Account >=cash){
                    int back = Account - cash;
                    System.out.println("sucessfull account balance is " + back);
                    }else{System.out.println("NOt enough balance in your account");}
                }
                if (a == 3) {
                    System.out.println("Enter amount");
                    int dip = sc.nextInt();
                    int total = dip + Account;
                    System.out.println("Sucessful Your new balance is" + " "  + total);

                }
                System.out.println("press 1 to continue");
                System.out.println("press 0 to exit");
                

            } else {
                System.out.println("Wrong pass");
            }
        } else {
            System.out.println("Wrong Account Number");
        }

    }

}

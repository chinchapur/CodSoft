import java.util.Scanner;

class Atm{
    float balance;
    int pin = 9989;

    public void checkPin(){
        System.out.println("Enter the PIN: ");
        Scanner sc = new Scanner(System.in);
        int checkpin = sc.nextInt();

        if(checkpin == pin){
            menu();
        }
        else{
            System.out.println("Invalid PIN!!");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdrow");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1: checkBalance();
            menu();
            break;
            case 2: withdrowMoney();
            menu();
            break;
            case 3: depositeMoney();
            menu();
            break;
            case 4: System.out.println("Good bye!!");
                    System.exit(0);
            break;
            default:System.out.println("Enter valid choice!!");
            menu();
        }
    }
    public void checkBalance(){
        System.out.println("Balance is: "+ balance);
        menu();
    }
    public void withdrowMoney(){
        System.out.println("Enter the amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int with = sc.nextInt();
        if(with>balance){
            System.out.println("Insufficient balance!!");
            menu();;
        }
        else{
            System.out.println("Money withdraw successfully!!");
            balance = balance - with;
            menu();
        }
    }
    public void depositeMoney(){
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        int dep = sc.nextInt();
        balance = balance + dep;
        System.out.println("Amount deposited successfully!!");
        menu();
    }
}

public class CodeSoft3 {
    public static void main(String[] args) {
        Atm M = new Atm();
        M.checkPin();
        
    }
}

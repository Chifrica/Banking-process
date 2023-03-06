import java.util.Scanner;
public class SchoolBankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;

    public SchoolBankAccount (int accountNumber, String customerName, double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depo){
        balance = balance + depo;
    }

    public void withDraw(double amount){
        if (balance < amount)
            System.out.println("Insufficient balance");
        else
            balance = balance - amount;
    }

    public static void main(String[] args) {

    // Continuation of Question 4

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your account name");
        String customerName = input.nextLine();

        System.out.println("Enter your account number");
        int accountNumber = input.nextInt();

        System.out.println("Enter your initial balance");
        double initialBalance = input.nextInt();

        SchoolBankAccount bankAccount = new SchoolBankAccount(accountNumber, customerName, initialBalance);

        System.out.println("Enter amount to deposit");
        double depositValue = input.nextDouble();
        bankAccount.deposit(depositValue);

        System.out.println("Your bakance = "+ bankAccount.getBalance());

        System.out.println("Enter amount to withdraw");
        double withDrawValue = input.nextDouble();
        bankAccount.withDraw(withDrawValue);
        System.out.println("Your bakance = "+ bankAccount.getBalance());
    }
}

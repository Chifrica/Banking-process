import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String customerNamer){
        this.customerName = customerNamer;
    }

    public void setAccNum(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBal(double balance){
        this.balance = balance;
    }

    public BankAccount (int accountNumber, String customerName, double balance){
        setAccNum(accountNumber);
        setName(customerName);
        setBal(balance);
    }

    public BankAccount(){
        this(0, "noName", 0);
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


// import java.util.*;


    public static void main(String[] args) {

// Continuation of Question 4

        BankAccount bankAccount = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your account name");
        bankAccount.setName(input.nextLine());

        System.out.println("Enter your account number");
        bankAccount.setAccNum(input.nextInt());

        System.out.println("Enter your initial balance");
        bankAccount.setBal(input.nextDouble());

        

        System.out.println("Enter amount to deposit");
        double depositValue = input.nextDouble();
        bankAccount.deposit(depositValue);

        System.out.println("Your bakance = "+ bankAccount.getBalance());

        System.out.println("Enter amount to withdraw");
        double withDrawValue = input.nextDouble();
        bankAccount.withDraw(withDrawValue);
        System.out.println("Your bakance = "+ bankAccount.getBalance());

// Question 1
       
        // String firstName, surName, lastName;
        // int age;

        // System.out.println("Enter your Firstname");
        // firstName = input.nextLine();

        // System.out.println("Enter your Surname");
        // surName = input.nextLine();

        // System.out.println("Enter your Lastname");
        // lastName = input.nextLine(); 
        
        // System.out.println("Enter your age");
        // age = input.nextInt();

        // // Generating a random number
        // Random rand = new Random();
        // int randomInt = rand.nextInt( 4);

        // System.out.println("Your random number is " + randomInt);
    
        // System.out.println(
        //     "Your password is " + 
        //     firstName.substring(0, 3) + 
        //     surName.substring(0, 3) + 
        //     lastName.substring(0, 3) + 
        //     randomInt * age
        // );

// Quetion 2
        // System.out.println("Enter your email address");
        // String email = input.nextLine();

        // int ch = email.indexOf('@');
        // String userName = email.substring(0, ch);
        // int domainExt = email.lastIndexOf('@');
        // String domain = email.substring(domainExt+1);

        // System.out.println("Your username is "+ userName + "\nYour domain name is " + domain );
    
// Question 3
        // Area of a triangle = 1/2 * b* h
        // Perimeter of a triangle is where s = a+b+c/2

        // System.out.println("Enter what you want to calculate in triangle: Perimeter or Area");
        
        // String area = "Area";
        // String perimeter = "Perimeter";
        // String value = input.nextLine();

        // if(value == area){
        //     System.out.println("Biscuit");
            // System.out.println("Input the values of a");
            // double a = input.nextDouble();
            // System.out.println("Input the values of b");
            // double b = input.nextDouble();
            // double output = (1/2 * (a * b));
            // System.out.println("The triangle whose sides are " + a + " " + b + " " + " has an area of " + output); 
        // }else if (value == perimeter){
        //     System.out.println("Goat");
            //     System.out.println("Input the values of a");
            //     double a = input.nextDouble();
            //     System.out.println("Input the values of b");
            //     double b = input.nextDouble();
            //     System.out.println("Input the values of c");
            //     double c = input.nextDouble();
            //     double output = (a+b+c)/2;
            //     System.out.println("The triangle whose sides are " + a + ", " + b + ", "  + c + " has a perimeter of " + output);
        // }else {
        //     System.out.println("Nothing");
            // System.out.println("You entered a wrong value");
        // }
       
// Question 
    }
}
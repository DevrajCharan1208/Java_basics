// Grandparent Class: Personal Info
class AccountHolder {
    String name = "Rahul Sharma";
    int age = 21;
    String gender = "Male";
}

// Parent Class: Account Details
class AccountDetails extends AccountHolder {
    String accNo = "9876543210";
    String accType = "Savings";
    double totalBalance = 5000.00;
}

// Child Class: Financial Operations
class BankOperations extends AccountDetails {
    
    void deposit(double amount) {
        totalBalance += amount;
        System.out.println("Depositing: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= totalBalance) {
            totalBalance -= amount;
            System.out.println("Withdrawing: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }

    void displayAnnualInterest() {
        // Assuming 5% annual interest
        double interest = totalBalance * 0.05;
        System.out.println("Annual Interest at 5%: " + interest);
    }

    void displayBalance() {
        System.out.println("---------------------------");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Final Balance: " + totalBalance);
        System.out.println("---------------------------");
    }
}

public class ClassTest2 {
    public static void main(String[] args) {
        // Creating the object of the lowest child class
        BankOperations account = new BankOperations();

        // Accessing inherited data and performing operations
        System.out.println("Initial Balance: " + account.totalBalance);
        
        // Simulating a deposit
        account.deposit(1500.0);
        
        // Simulating a withdrawal
        account.withdraw(2000.0);
        
        // Calculating Interest
        account.displayAnnualInterest();
        
        // Displaying final summary
        account.displayBalance();
    }
}
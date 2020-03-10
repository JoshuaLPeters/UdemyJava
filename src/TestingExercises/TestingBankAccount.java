package TestingExercises;

public class TestingBankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public TestingBankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // branch arguement is true if the customer is performing the transaction at the branch with a teller.
    //False if at an atm
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public double withdrawal(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

}

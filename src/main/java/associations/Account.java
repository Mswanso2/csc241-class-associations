package associations;

public class Account{

  // Add instance variables
    private String AccountNumber;
    private Customer username;
    private double balance;

  // A constructor that initializes the account number and Customer, and sets the balance to zero.
    public Account(String AccountNumber, Customer username){
        this.AccountNumber = AccountNumber;
        this.username = username;
        balance = 0;
    }
  // getAccountNumber() - Returns a String representing the account number.
    public String getAccountNumber(){
        return AccountNumber;
    }
  // getCustomer() - Returns a reference to the Customer object associated with this account
    public Customer getCustomer(){
        return username;
    }
  // getBalance() - Returns the avaiable balance (may be a decimal value)
    public double getBalance(){
        return balance;
    }
}

package BankAccount;

public class BankAccount {

   private String accountNumber;
   private String accountHolderName;
   private Double balance;


    public BankAccount(String accountName, String accountHolderName) {
        this.accountNumber = accountName;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void depositAccount (Double amount) {

        this.balance=amount;
    }


    public void withdrawMoney ( Double amount) {

        if (amount>this.balance) {

            System.out.println("You have no enough fund in balance");

        }
        else {
            this.balance=(this.balance-amount);

        }
    }

    public void displayDetails () {

        System.out.println(  "Account number: " + accountNumber +
                          "\n Account holder: " + accountHolderName +
                          "\n Balance: " + balance
        );
    }
}

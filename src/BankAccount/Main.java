package BankAccount;

public class Main {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("152544" ,"Ravid"  );

        bankAccount.displayDetails();

        bankAccount.depositAccount(1500.0);

        bankAccount.displayDetails();


        bankAccount.withdrawMoney(1000.0);

        bankAccount.displayDetails();

        bankAccount.withdrawMoney(700.0);

    }
}

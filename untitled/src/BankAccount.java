public class BankAccount {
    //variable
        //amount/balance
        //name/id
        //transactions
        //account number and sort code

   private double balance;
    private String name;


    //constructor (s)
    public BankAccount(double balance, String name){
        this.balance=balance;
        this.name=name;
    }

    //getters & setters
        //check balance & transactions & details

    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //methods
        //deposit
        //withdraw
    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }
}

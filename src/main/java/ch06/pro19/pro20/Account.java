package ch06.pro19.pro20;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private int balance;

    Account(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {return balance; }

    boolean deposit(int money) {
        if (money <= 0) return false;
        balance += money;
        return true;
    }

    boolean withdrawal(int money) {
        if (balance < money) return false;
        else {
            balance -= money;
            return true;
        }
    }
}

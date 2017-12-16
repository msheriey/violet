package jonamato.violet.wallet;

public class Wallet {

    private int balance = 0;

    public double get() { return balance; }

    public boolean check(double balance) { return this.balance >= balance; }

    public void add(double balance) { this.balance += balance; }

    public void deduct(double balance) { this.balance -= balance; }

}
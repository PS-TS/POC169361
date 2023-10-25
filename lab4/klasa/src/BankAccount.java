public class BankAccount {
    double balance = 0;

    public void deposit(double ammount){
        balance+=ammount;
    }
    public void withdraw(double ammount){
        balance-=ammount;
    }
}

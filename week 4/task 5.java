import java.util.*;

class Bank {
    int balance = 1000;

    void deposit(int a) {
        balance += a;
    }

    void withdraw(int a) {
        if (a <= balance) balance -= a;
        else System.out.println("Insufficient Balance");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.println("1 Deposit\n2 Withdraw\n3 Balance");
        int c = sc.nextInt();

        if (c == 1) b.deposit(sc.nextInt());
        else if (c == 2) b.withdraw(sc.nextInt());

        System.out.println("Balance: " + b.balance);
    }
}


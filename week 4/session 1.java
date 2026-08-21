import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int amount = sc.nextInt();

        balance = balance - amount;

        System.out.println("Transaction Successful");
        System.out.println("Balance: " + balance);
    }
}


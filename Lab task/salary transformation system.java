iimport java.util.*;

class SalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double bonus = basic * 0.05;

        double totalSalary = basic + hra + da + bonus;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
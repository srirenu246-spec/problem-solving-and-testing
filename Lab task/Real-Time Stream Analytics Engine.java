import java.util.*;

class StreamAnalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data values: ");
        int n = sc.nextInt();

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter stream values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            sum += value;

            if (value > max)
                max = value;

            if (value < min)
                min = value;

            double average = (double) sum / (i + 1);

            System.out.println(
                "New Value: " + value +
                " | Average: " + average +
                " | Max: " + max +
                " | Min: " + min
            );
        }

        sc.close();
    }
}
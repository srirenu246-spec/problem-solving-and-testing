import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dna = sc.nextLine();
        String pattern = sc.nextLine();

        for (int i = 0; i <= dna.length() - pattern.length(); i++) {
            int j;

            for (j = 0; j < pattern.length(); j++) {
                if (dna.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == pattern.length()) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}

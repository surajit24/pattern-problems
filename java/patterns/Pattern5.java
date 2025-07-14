package patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void runPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines to generate the pattern: ");
        int noOfLines = sc.nextInt();

        for (int i = 0; i < noOfLines; i++) {
            for (int j = noOfLines - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

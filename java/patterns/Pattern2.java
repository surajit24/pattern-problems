package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void runPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines to generate the pattern: ");
        int noOfLines = sc.nextInt();

        for (int i = 0; i < noOfLines; i++) {
            for (int j = 0; j < noOfLines - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

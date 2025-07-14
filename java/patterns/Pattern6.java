package patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void runPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines to generate the pattern: ");
        int noOfLines = sc.nextInt();

        for (int i = 0; i < noOfLines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = noOfLines - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

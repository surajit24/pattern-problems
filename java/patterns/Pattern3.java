package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void runPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines to generate the pattern: ");
        int noOfLines = sc.nextInt();

        for (int i = 0; i < noOfLines; i++) {
            for (int j = 0, k = 1; j <= i; j++, k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();

    }
}

# Pattern 6

## Problem Statement:

Design and implement an algorithm to print a specific pattern of asterisks (```*```) on the console, given a certain input parameter ```n```.

### Example:

For ```n = 5```, the pattern might look like:

```
*****
 ****
  ***
   **
    *
```

## Solution:

```
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
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
```

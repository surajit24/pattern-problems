# Pattern 4

## Problem Statement:

Design and implement an algorithm to print a specific pattern of numbers (```1,2,3,...```) on the console, given a certain input parameter ```n```.

### Example:

For ```n = 5```, the pattern might look like:

```
    1
   12
  123
 1234
12345
```

## Solution:

```
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines to generate the pattern: ");
        int noOfLines = sc.nextInt();

        for (int i = 0; i < noOfLines; i++) {
            for (int j = 0; j < noOfLines - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1, j = 0; j <= i; j++, k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();

    }
}
```

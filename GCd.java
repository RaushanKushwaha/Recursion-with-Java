// Greater common factor

import java.util.Scanner;

public class GCd {
    // using itteration
    static int findGCD(int x, int y) {
        int rem = 0;
        while (x % y != 0) {
            rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }

    // using recursion
    static int findGCDusingRecursion(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findGCDusingRecursion(y, x % y);

    }
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        // System.out.println(findGCD(x, y));
        System.out.println(findGCDusingRecursion(x, y));
    
    }
}

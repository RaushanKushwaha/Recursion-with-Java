import java.util.Scanner;

public class factorial {
    static int calculateFactorial(int n){
        if (n<=1) {  
            return 1;
        }
         return n*calculateFactorial(n-1);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n:");
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n +" = " + calculateFactorial(n));
     }
}

// Time complexity & Space complexity = o(n)
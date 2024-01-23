import java.util.Scanner;

public class sumOfdigits {

     static int calculateSumOfDigits(int n){
        // int count =0;
        if (n>=0 && n<=9) {
            return n;
        } 
    
        return calculateSumOfDigits(n/10)+(n%10);
     }
     static int countDigits(int n){
        // int count =0;
        if (n>=0 && n<=9) {
            return 1;
        } 
    
        return countDigits(n/10)+1;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = "+calculateSumOfDigits(n));
    }
    
}

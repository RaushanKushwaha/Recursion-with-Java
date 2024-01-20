import java.util.Scanner;

/**
 * PrintIDecreasingNaturalNumber
 */
public class PrintIDecreasingNaturalNumber {
    static void PrintDecreasingNaturalNumber(int n){
            if (n<=1) {
                System.out.println(1);
                return ;
            }
            System.out.println(n);
            PrintDecreasingNaturalNumber(n-1);
    }
    // Increasing order;
    static void PrintIncreasingNaturalNumber(int n){
        if (n<=1) {
            System.out.println(1);
            return ;
        }
        PrintIncreasingNaturalNumber(n-1);
        System.out.println(n);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        PrintDecreasingNaturalNumber(n);
        PrintIncreasingNaturalNumber(n);
    }
}
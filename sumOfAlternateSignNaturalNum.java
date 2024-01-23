import java.util.Scanner;

public class sumOfAlternateSignNaturalNum {
    static int sum(int n){
        // int add =0;
        if (n==0) {
            return 0;
        }
       if (n%2==0) {
         return sum(n-1) - n;
       }else{
        return sum(n-1) + n;
       }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
// 1 -2 3 -4 5
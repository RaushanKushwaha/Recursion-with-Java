import java.util.Scanner;

/**
 * fibonacci series -- 0 1 1 2 3 5 8 ..
 */
public class fibonacci {
   static int findFibonacci(int n){
     if (n==0 || n==1) {
        return n;
     }
      
     return findFibonacci(n-1)+findFibonacci(n-2);
    
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n th term:");
        int n = sc.nextInt();
        System.out.println("At "+n+ "th term fibonacci num is :"+findFibonacci(n));
        for (int i = 0; i <=n; i++) {
             System.out.println(findFibonacci(i));
        }
    }
     
    
}

// Time complexity  = o(2 to the power n)
// Space complexity  = o(n)
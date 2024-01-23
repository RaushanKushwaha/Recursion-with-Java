import java.util.Scanner;

public class multipleOfNum {
    static void  multipleOfNumber(int num ,int k){
      if (k<=0) {
         return ;
      }
       multipleOfNumber(num, k-1); 
       System.out.println(num*k);
      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        multipleOfNumber(num, k);
    }
}

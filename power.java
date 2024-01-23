import java.util.Scanner;

public class power {
    // 1st method
    static int caluclatePower(int base,int power){
        if (power<=0) {
            return 1;
        }     
        return caluclatePower(base,power-1)*base;
    }
    // 2nd and optimized method 
    static int pow(int p,int q){
        if (q<=0) {
            return 1;
        }
        int smallPow = pow(p,q/2);
        if (q%2==0) {
             return smallPow*smallPow;
        }else
          return p*smallPow*smallPow;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and power: ");
        int base = sc.nextInt();
        int power = sc.nextInt();
        // System.out.println("Ans = "+ caluclatePower(base, power));
        System.out.println("Ans = "+ pow(base, power));
    }
}

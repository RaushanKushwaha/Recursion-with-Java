import java.util.Scanner;

public class removeOccuranceFromString {
    static String removeOccuranceOfafromString(String s,int index){
        if (index == s.length()) {
            return "" ;
        }
         String smallans =   removeOccuranceOfafromString(s,  index+1);
        char currChar = s.charAt(index);
        if (currChar!='a') {
            return currChar + smallans;
        }else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i)=='a') {
        //         ans += "";
        //     }else{
        //         ans += s.charAt(i);
        //     }
        // }
        // System.out.println(ans);
        ans = removeOccuranceOfafromString(s, 0);
        System.out.println(ans);
    }
}

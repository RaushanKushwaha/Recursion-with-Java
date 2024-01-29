import java.util.Scanner;

public class reverseString {
   static String  reverse(String s,int index){
    
    if (index==s.length()) {
        return "";
    }
      String smallAns = reverse(s,index+1); 
      return smallAns + s.charAt(index);
   }
   // without indexing
   static String  reverse2(String s){
    
    if (s.length()==0) {
        return "";
    }
      String smallAns = reverse2(s.substring(1)); 
      return smallAns + s.charAt(0);
   }
   static void palindrom(String s){
    if (s.equals(reverse2(s))) {
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
   }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter string:");
         String s = sc.nextLine();
        //  System.out.println(reverse2(s));
           palindrom(s);
    }
    
}

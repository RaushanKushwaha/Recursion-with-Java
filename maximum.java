public class maximum {
    static int findMaximum(int arr[],int index){
      if (index==arr.length-1) {
        return arr[index];
      }

      int smallAns = findMaximum(arr, index+1);
      return Math.max(smallAns, arr[index]);
    }
    static int sumOfArray(int arr[],int index){
        if (index==arr.length-1) {
          return arr[index];
        }
  
        int smallAns = sumOfArray(arr, index+1);
        return arr[index]+smallAns;
      }
    public static void main(String[] args) {
        int arr[] = {0};
    //    System.out.println(findMaximum(arr, 0));
      System.out.println(sumOfArray(arr, 0));
    }
    
}

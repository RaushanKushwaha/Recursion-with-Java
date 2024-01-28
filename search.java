public class search {
    static int searchUsingRecursion(int arr[],int target,int index){
        int n = arr.length;
        if (index >= n) {
            return -1;
        }

        if (arr[index]==target) {
            return index;
        }
        return searchUsingRecursion(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,-5,9};
        int target = -5;
        int index = 0;
        if (searchUsingRecursion(arr, target, index)==-1) {
           System.out.println("Not found"); 
        }else
       System.out.println(target+" is found at index "+searchUsingRecursion(arr, target, index));

    }
}

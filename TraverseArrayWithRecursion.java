public class TraverseArrayWithRecursion {
    static void traverArray(int arr[],int index){
        int n = arr.length;
        if (index==n) {
            return;
        }
        System.out.println(arr[index]);
        traverArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        traverArray(arr, 0);
    }
}

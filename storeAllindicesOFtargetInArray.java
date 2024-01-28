import java.util.ArrayList;

public class storeAllindicesOFtargetInArray {
    static ArrayList<Integer> allindices(int arr[],int target,int index){
        int n = arr.length;
        if (index>=n) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if (arr[index]==target) {
            ans.add(index);
        }
        ArrayList<Integer> smallAns = allindices(arr, target, index+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
       int arr[] = {2,3,4,3,4,3};
       ArrayList<Integer> ans = allindices(arr, 3, 0);
       for(Integer i: ans){
        System.out.println(i);
       }
    }
}

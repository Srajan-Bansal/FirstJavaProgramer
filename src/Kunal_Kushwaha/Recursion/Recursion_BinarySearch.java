package Kunal_Kushwaha.Recursion;

public class Recursion_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 45, 78, 89};
        int target = 78;
//        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m] > target){
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }
}

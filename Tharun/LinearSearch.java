package Tharun;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,21,33,31,44,70,56,100};
        int target = 31;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int index=0;index<arr.length;index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}

//lec-32 pr2
//TC=SC=O(n)
public class MaxValueOfArray {
    public static void main(String[] args) {
        int[]arr= {3, 10, 3, 2, 15};
        int idx=0;
        System.out.println("The maximum value in the array is : "+printMax(arr, idx));
    }
    static int printMax(int[] arr, int idx){
        //base case
        if(idx==arr.length-1) return arr[idx];
        //small problem
        int smallWork=printMax(arr, idx+1);
        //self work
        return Math.max(arr[idx], smallWork);
    }
}

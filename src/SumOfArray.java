public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5};
        int idx=0;
        System.out.println("The sum of array is : "+sumArray(arr, idx));
    }
    static int sumArray(int[]arr, int idx){
        //base case
        if(idx==arr.length) return 0;
        //recursive work
        int smallAns = sumArray(arr, idx+1);
        //selfWork
        return arr[idx]+smallAns;
    }
}

public class GetIndexOfXInArray {
    public static void main(String[] args) {
        int arr []= {1, 1, 3, 2, 1};
        int target = 3;
        int idx=0;
        int n=arr.length;
        printIndex(arr, n, target, idx);
    }
    static void printIndex(int []arr, int n, int target, int idx){
        //base case
        if(idx>=n){
            return;
        }
        //self work
        if(arr[idx]== target){
            System.out.print(idx+" ");
        }
        //recursive work
        printIndex(arr, n, target, idx+1);
    }
}

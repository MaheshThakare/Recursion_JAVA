public class PrintArray {
    public static void main(String[] args) {
        int [] arr= {5, 4, 2, 3};
        //int n = arr.length;
       // printArray(arr, n-1);
        //for second method
        int index=0;
        printArray(arr,0);
    }
//    static void printArray(int[]arr, int n){
//        //base case
//        if(n==0){
//            System.out.println(arr[0]);
//            return;
//        }
    //recursive work
//        printArray(arr, n-1);
    //self work
//        System.out.println(arr[n]);
//    }

    //second
    static void printArray(int[]arr, int n){
        //base case
        if(n== arr.length) return;
        //self work
        System.out.println(arr[n]);
        //recursive work
        printArray(arr, n+1);

    }
}

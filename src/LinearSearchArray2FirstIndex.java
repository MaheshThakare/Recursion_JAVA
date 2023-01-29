public class LinearSearchArray2FirstIndex {
    public static void main(String[] args) {
        int []arr= {1, 2, 3, 4, 5, 6, 7};
        int x=1;
        int idx=0;
        System.out.println(indexOfX(arr, x, idx));
    }
    static int indexOfX(int[]arr, int x, int idx){
        //base case
        if(idx>=arr.length) return -1;
        //self work
        if(arr[idx]==x) return idx;
        //recursive work
        return indexOfX(arr, x,idx+1);
    }
}

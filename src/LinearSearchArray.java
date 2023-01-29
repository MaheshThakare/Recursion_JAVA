//lec-33 pr1 return ttrue or false
//TC=SC=O(n)
public class LinearSearchArray {
    public static void main(String[] args) {
        int [] arr= {4, 12, 54, 14, 3, 8, 6, 11};
        int x=11;
        int idx=0;
        System.out.println(isXInArray(arr, x, idx));
    }
    static boolean isXInArray(int[]arr, int x, int idx){
        //base case
        if(idx>=arr.length) return false;
        //self Work
        if(arr[idx]==x) return true;
        //recursive work
        return isXInArray(arr, x, idx+1);
    }
}

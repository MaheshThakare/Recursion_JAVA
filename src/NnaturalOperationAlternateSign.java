public class NnaturalOperationAlternateSign  {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumAll(n));
    }
    static int sumAll(int n){
        //base case
        if(n==0) return 0;
        int smallWork=sumAll(n-1);
        if(n%2==0){
            return smallWork-n;
        }
        else{
            return smallWork+n;
        }
    }
}
//TC=O(n)
//SC=O(n)
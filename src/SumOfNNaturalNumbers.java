public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumAll(n));
    }
    static int sumAll(int n){
        //base case
        if(n==0) return 0;
        return n+sumAll(n-1);
    }
}

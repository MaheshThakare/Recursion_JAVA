public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        int n = 555;
        System.out.println(sumDigits(n));
    }
    static int sumDigits(int n){
        //base case
        if(n>=0 && n<=9){
            return n;
        }
        //recursive work
        int smallWork=sumDigits(n/10);
        //self work
        int ans = smallWork+n%10;
        return ans;
    }
}

//TC=O(n)
//SC=O(n)

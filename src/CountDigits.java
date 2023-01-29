//extended question lecture 29 recursion2
public class CountDigits {
    public static void main(String[] args) {
        int n = 1234567890;
        System.out.println(countDigits(n));
    }
    static int countDigits(int n){
        //base case
        if(n>=0 && n<=9) return 1;
        //recursive work
        int smallAns=countDigits(n/10);
        //self work
        int ans = smallAns+1;
        return ans;
    }
}

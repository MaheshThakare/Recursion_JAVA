public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial is : "+calFacto(n));
    }
    static int calFacto(int n){
        //base case
        if(n==0) return 1;
        //recursive of smaller work
        int smallAnswer = calFacto(n-1);
        //self work
        int ans=n* smallAnswer;
        return ans;
    }
}

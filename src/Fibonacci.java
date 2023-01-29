public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("The nth term is: "+fibo(n));
        System.out.println("The nth term is:");
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n){
        //base case
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        //recursive work
        int prev = fibo(n-1);
        int prevPrev = fibo(n-2);
        //self work
        return prev+prevPrev;
    }
}

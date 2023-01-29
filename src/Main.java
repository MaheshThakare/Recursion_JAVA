public class Main {
    public static void main(String[] args) {
        int n = 5;
        printDecreasing(n);
    }
    static void printDecreasing(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n);
        //recursive work
        printDecreasing(n-1);
    }
}
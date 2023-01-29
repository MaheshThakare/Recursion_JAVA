import java.util.Scanner;
public class printnNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnnum(n);
    }
    static void printnnum(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //recursive work
        printnnum(n-1);
        //self work
        System.out.println(n);
    }
}

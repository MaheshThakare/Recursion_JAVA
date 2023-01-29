import static java.lang.Math.max;
import static java.lang.Math.min;
public class GCDAndEucloidsAlog {
    public static void main(String[] args) {
        int x= 12;
        int y = 16;
        //gcd1(x,y);
        //System.out.println(gcd2(x,y));
        System.out.println(eucloidsGCD(x,y));
    }
    //Brutforce Approach
//    TC=O(min(x,y))
    static void gcd1(int x, int y){
        int min=min(x,y);
        System.out.println(min);
        for(int i= min; i>1; i--){
            if(x%i==0 && y%i==0){
                System.out.println("The GCD is : "+i);
                return;
            }
        }
    }
    //by long division
    static int gcd2(int x, int y){
        while(x%y!=0){
            int remainder=x%y;
            x=y;
            y=remainder;
        }
        return y;
    }
    //by eucloids algorithm for GCD
    static int eucloidsGCD(int x, int y){
        //base work
        if(y==0) return x;
        //recursive work
        return eucloidsGCD(y, x%y);

    }
}

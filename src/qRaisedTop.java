//Lecture29 Recursion2
public class qRaisedTop {
    public static void main(String[] args) {
        int p = 2;
        int q = 4;
        System.out.println(calPower(p, q));
        System.out.println(pow2(p,q));
    }

    static int calPower(int p, int q) {
        //base case
        if (q == 0) return 1; //or if(q==1) return p;
        //recursive work
        int smallWork = calPower(p, q - 1);
        //self work
        int ans = smallWork * p;
        return ans;
    }

//TC=O(q)
//SP=O(q)

    //more optimized method
    static int pow2(int p, int q){
        //base case
        if(q==0) return 1;
        //reursive work
        int smallAns= pow2(p, q/2);

        //if power is even
        if(q%2==0){
            //self work
            int ans = smallAns*smallAns;
            return ans;
        }
        //if power is odd
        else{  //else id optional without it, program also work
            //self work
            int ans = p*smallAns*smallAns;
            return ans;
        }
    }

//    TC=O(logq)  in q/2, 2^k>q to obtain 0. so takint log(2^k)>logq
//    SC=O()
}
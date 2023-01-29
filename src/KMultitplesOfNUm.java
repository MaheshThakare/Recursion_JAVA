public class KMultitplesOfNUm {
    public static void main(String[] args) {
        int num=3;
        int k=8;
        multiples(num, k);
    }
    static void multiples(int num, int k){
        //Base case
        if(k==1){
            System.out.println(num);
            return ;
        }
        //recursive work
        multiples(num, k-1);
        //self Work
        System.out.println(num*k);
    }
}

//TC=O(k)
//SC=O(k)

public class PallindromString {
    public static void main(String[] args) {
        String s = "leveel";
        isPallindrom(s);//by reversing the string by creating an object
        System.out.println();
        int l=0;
        int r=s.length()-1;
        System.out.println(isPallindrom1(s, l, r)); //without reversing the string
    }
    static void isPallindrom(String s){
        RevString obj = new RevString();
        String rev = obj.reverseString(s);
        if(rev.equals(s)){
            System.out.println("The String is a Pallindrom");
        }else{
            System.out.printf("%s is not Pallindrom", s);//printf
            //TC=(n^2)
        }
    }
    static boolean isPallindrom1(String s, int l, int r){
        //base case
        if(l>=r) return true;

        return (s.charAt(l)==s.charAt(r) && isPallindrom1(s, l+1, r-1));
    //TC=(n)
    }
}

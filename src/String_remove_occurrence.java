//remove all occurrences of "a" from a string "abcax"
//TC:- In this example there is linear time-consuming operation
//            return s.charAt(idx)+smallAns;
// so it will have the time complexity of n
//TC= no of call*time for 1 call
//TC=n*(n+c)=n^2
//String concatenation is a linear time-consuming operation which can be overcome in stringBuilder to constant time operation
public class String_remove_occurrence {
    public static void main(String[] args) {
        String s = "abcacx";
        char target = 'a' ;
        int idx=0;
        int n = s.length();
        System.out.println(removeChar1(s, n,  target, idx));
        System.out.println(removeChar(s, 'c'));
    }
    //by passint index or idx as the reference
    static String removeChar1(String s,int n, char target, int idx){
        //base case
        if(idx==n) return "";
        //self work
        String smallAns=removeChar1(s, n, target, idx+1);;
        //recursive work
        if(s.charAt(idx)!=target){
            return s.charAt(idx)+smallAns;
        }else{
            return smallAns;
        }
    }
    //without passing idx directly returning the sugstrings
    static String removeChar(String s, char target){
        //base case
        if(s.length()==0) return "";
        //recursive work
        String smallAns= removeChar(s.substring(1), target);
        //Self work
        if(s.charAt(0)!=target){
            return s.charAt(0)+smallAns;
        }else{
            return smallAns;
        }
    }
}

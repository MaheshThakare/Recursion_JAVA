public class RevString {
    public static void main(String[] args) {
        String s="abacus";
        System.out.println(reverseString(s));
    }
    //we can do this by passing idx also
    static String reverseString(String s){
        //base case
        if(s.length()==0) return "";
        //recursive work
        String smallans = reverseString(s.substring(1));
        //self work
        return smallans+ s.charAt(0);
    }
}

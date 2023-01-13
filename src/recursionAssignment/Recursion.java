package recursionAssignment;

public class Recursion{

    public static int count7(int n){
        if (n < 1){
            return 0;
        } else {
            if (n%10 == 7){
                return 1 + count7(n/10);
            } else {
                return count7(n/10);
            }
        }
    }

    public static int countHi(String str){
        if (str.length() < 2){
            return 0;
        } else {
            if (str.substring(0, 2).equals("hi")){
                return 1 + countHi(str.substring(1));
            } else {
                return countHi(str.substring(1));
            }
        }
    }

    public static String changePi(String str){
        if (str.length() < 2){
            return str;
        } else {
            if (str.substring(0, 2).equals("pi")){
                return "3.14" + changePi(str.substring(2));
            } else {
                return str.charAt(0) + changePi(str.substring(1));
            }
        }
    }

    public static String pairStar(String str){
        if (str.length() < 2){
            return str;
        } else {
            if (str.substring(0, 1).equals(str.substring(1, 2))){
                return str.charAt(0) + "*" + pairStar(str.substring(1));
            } else {
                return str.charAt(0) + pairStar(str.substring(1));
            }
        }
    }

    public static String stringClean(String str){
        if (str.length() < 2){
            return str;
        } else {
            if (str.charAt(0) == str.charAt(1)){
                return stringClean(str.substring(1));
            } else {
                return str.charAt(0) + stringClean(str.substring(1));
            }
        }
    }

    public static boolean strCopy(String str, String sub, int n){
        if (n == 0){
            return true;
        } else {
            if (str.length() < sub.length()){
                return false;
            } else {
                if(str.substring(0, sub.length()).equals(sub)){
                    return strCopy(str.substring(1), sub, n-1);
                } else {
                    return strCopy(str.substring(1), sub, n);
                }
            }  
        }
    }

}

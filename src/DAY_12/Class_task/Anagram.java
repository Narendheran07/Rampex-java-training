package DAY_12.Class_task;

public class Anagram {
    public static void main(String[] argsd) {

        isAnagram("pot", "top");
    }

    public static boolean isAnagram(String s1, String s2) {
        //intput 2 sting
        //true /false
        //1.compare the string length
        //2.if length not same return false
        if (s1.length() == s2.length()) {
            return true;
        }
        for (int j = 0; j < s2.length(); j++) {
            for (int i = 0; i < s1.length(); i++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}




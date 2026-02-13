package Strings;

public class stringsss {
    public static boolean palindrome(String s) {
        s=s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
    public static boolean betterIsPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Skip non-alphanumeric from left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Skip non-alphanumeric from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "fvjhfiohefiuoeraghuitghariegharpegh";
        int count = 0;
        for (int i= 0;i<s.length();i++){
           char ch = s.charAt(i);
           if (ch=='a'||ch=='e' ||ch== 'i'||ch=='o'||ch=='u') count++;
        }
//        System.out.println(count);
        System.out.println(palindrome("dad"));;
    }

}

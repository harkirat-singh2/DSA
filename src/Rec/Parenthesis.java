package Rec;

import java.util.*;

public class Parenthesis {

    public static void helper(int n, int l, int r, String s, List<String> ans) {

        if (r == n) {   // valid complete string
            ans.add(s);
            return;
        }

        if (l < n)
            helper(n, l + 1, r, s + "(", ans);

        if (r < l)
            helper(n, l, r + 1, s + ")", ans);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}

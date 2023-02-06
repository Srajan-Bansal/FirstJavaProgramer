package hackcodingblocks.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    public static void main(String[] args) {
//        parentheses(3, "", 0, 0);
        System.out.println(parentheses(3, "", 0, 0));
//        System.out.println(list);
    }

    static List<String> list = new ArrayList<>();

    static List<String> parentheses(int n, String ans, int open, int close) {
        if (open == n && close == n) {
//            System.out.println(ans);
            Parentheses.list.add(ans);
        }
        if (open < n) {
            parentheses(n, ans + "(", open + 1, close);
        }
        if (open > close) {
            parentheses(n, ans + ")", open, close + 1);
        }
        return Parentheses.list;
    }
}

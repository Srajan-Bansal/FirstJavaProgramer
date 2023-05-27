package Algorithims;

public class set_length {
    public static void main(String[] args) {
        System.out.println(removeStars("abb*cdfg*****x*"));
    }

    public static String removeStars(String s) {
        StringBuilder str = new StringBuilder("");
        for (char ch : s.toCharArray()) {
            if (ch == '*' && str.length() > 0) {
                str.setLength(str.length() - 1);
            } else str.append(ch);
        }
        return str.toString();
    }
}

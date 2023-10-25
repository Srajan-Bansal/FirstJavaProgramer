import java.util.*;

public class CodeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            c = Character.toLowerCase(c);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append('.').append(c);
            }
        }

        System.out.println(sb);
    }
}

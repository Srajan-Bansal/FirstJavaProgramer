package hackcodingblocks.Math.BitMasking;

import java.util.*;
/*Once again Tavas started eating coffee mix without water! Keione told him that it smells awful, but he didn't stop doing that. That's why Keione told his smart friend, SaDDas to punish him! SaDDas took Tavas' headphones and told him: "If you solve the following problem, I'll return it to you."

The problem is:

You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

If we sort all lucky numbers in increasing order, what's the 1-based index of n?

Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his headphones back.

Input Format
The first and only line of input contains a lucky number n (1 ≤ n ≤ 109).

Constraints
Output Format
Print the index of n among all lucky numbers.

Sample Input
4
Sample Output
1
* */

public class Tavas_And_SaDDas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        calculateMagicIndex(inputString);
    }

    public static void calculateMagicIndex(String word) {
        int length = word.length();
        int count = (1 << length) - 2;
        int position = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            char character = word.charAt(i);
            if (character == '7') {
                count = count + (1 << position);
            }
            position++;
        }

        System.out.println(count + 1);
    }
}
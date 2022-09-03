package Kunal_Kushwaha.LinkedList.Questions;

public class HappyNumber implements LinkedListLeetcode{

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        return false;
    }

    private int findSquare(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

}

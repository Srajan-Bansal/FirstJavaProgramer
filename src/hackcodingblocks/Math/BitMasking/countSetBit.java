package hackcodingblocks.Math.BitMasking;

public class countSetBit {
    public static void main(String[] args) {
        System.out.println(count(64));
    }

    static int count(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }
}

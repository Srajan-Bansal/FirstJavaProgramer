package Kunal_Kushwaha.Recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
//        diceThrow("", 4);
//        System.out.println(diceThrowList("", 4));

        System.out.println(diceThrowFace("", 7, 7));
    }

    static void diceThrow(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        if (target < 0) return;
        for (int i = 1; i <= 6; i++) {
            diceThrow(p + i, target - i);
        }
    }

    static List<String> diceThrowList(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceThrowList(p + i, target - i));
        }
        return list;
    }

    static List<String> diceThrowFace(String p, int target, int face) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceThrowFace(p + i, target - i, face));
        }
        return list;
    }
}

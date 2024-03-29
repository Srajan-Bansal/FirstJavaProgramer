package hackcodingblocks.Greedy;

import java.util.*;

public class ScheduleMeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Pair[] pair = new Pair[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                pair[i] = new Pair(a, b);
            }
//            Arrays.sort(pair, (o1, o2) -> o1.end - o2.end);
            Arrays.sort(pair, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.end - o2.end;
                }
            });

            int count = 1, end = pair[0].end;
            for (int i = 1; i < pair.length - 1; i++) { // -1 why donot know try remove it
                if (pair[i].start >= end) {
                    count++;
                    end = pair[i].end;
                }
            }
            System.out.println(count);
        }

    }
    static class Pair {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
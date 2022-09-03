package Algorithims;

public class Boyer_Moore_Majority_Voting_Algorithm {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 2, 3, 1, 5};

        int count = 1;
        int canditate = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                canditate = arr[i];
            }
            if (canditate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(canditate);
    }
}

package Kunal_Kushwaha.Recursion.Subset_and_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        System.out.println(subSet(arr));

        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> subsets = findSubsets(nums);
        System.out.println(subsets);

    }
    static List<List<Integer>> subSet (int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num: arr) {
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        generateSubsets(nums, 0, currentSubset, result);

        System.out.println(result.size());
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(currentSubset));

        // Generate subsets by including/excluding each element
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the subset
            currentSubset.add(nums[i]);

            // Recursively generate subsets for the remaining elements
            generateSubsets(nums, i + 1, currentSubset, result);

            // Exclude the current element (backtrack)
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}


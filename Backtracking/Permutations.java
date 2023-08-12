//https://leetcode.com/problems/permutations/
package Backtracking;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {

    public static List<List<Integer>> solve(int[] nums) {
        return permute(nums, 0, nums.length - 1);
    }

    public static List<List<Integer>> permute(int[] nums, int left, int right) {
        List<List<Integer>> result = new ArrayList<>();

        if (left == right) {
            List<Integer> n = new ArrayList<>();
            n.add(nums[left]);

            List<List<Integer>> ret = new ArrayList<>();
            ret.add(n);
            return ret;
        }

        for (int i = 0; i < (right - left + 1); i++) {
            List<List<Integer>> perms = permute(nums, left + 1, right);

            for (var perm : perms) {
                perm.add(nums[left]);
            }

            result.addAll(perms);

            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }

        return result;
    }

    public static void consumate(List<Integer> lst) {
        lst.forEach(e -> {
            System.out.print(e + ", ");
        });
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        List<List<Integer>> p = permute(nums, 0, nums.length - 1);

        p.forEach(l -> {
            System.out.println("\n-----");
            Permutations.consumate(l);
        });
    }
}

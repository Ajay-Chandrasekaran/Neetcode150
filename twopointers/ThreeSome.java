package twopointers;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> worldList = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int threeSome = nums[i] + nums[left] + nums[right];

                if (threeSome < 0) {
                    left++;
                } else if (threeSome > 0) {
                    right--;
                } else {
                    worldList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;

                    while ((nums[left] == nums[left - 1]) && (left < right)) {
                        left++;
                    }
                }
            }
        }
        return worldList;
    }
}

public class ThreeSome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // List<List<Integer>> list = sol.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
        List<List<Integer>> list = sol.threeSum(new int[] { 0, 0, 0 });
        for (List<Integer> t : list) {
            t.forEach(System.out::println);
            System.out.println("----------------");
        }
    }
}

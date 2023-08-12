public class MinRotated {

    public static int getmin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left < right) {
            mid = (left + right) / 2;

            if (nums[left] <= nums[right]) {
                return nums[left];
            }

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else if (nums[mid] <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2 };

        /*
         * 1, 2, 3
         * 2, 3, 1
         * 3, 1, 2
         * 1, 2, 3
         */

        System.out.println(getmin(nums));
    }
}

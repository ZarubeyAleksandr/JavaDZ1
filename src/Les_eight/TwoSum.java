package Les_eight;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(target - nums[i])) {
                return new int[]{i, myMap.get(target - nums[i])};
            } else {
                myMap.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3));
    }

}

package Lesson_eight;

import java.util.HashMap;

public class Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int num : nums) {
            if (myMap.containsKey(num))
                return true;
            myMap.put(num, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3));
    }
}

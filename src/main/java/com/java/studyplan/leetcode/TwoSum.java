package com.java.studyplan.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

/**
 * @author xuguoqi
 * @desc 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * @date 2020/5/19 10:43
 */
public class TwoSum {
    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return 时间复杂为O(n^2)
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if(target==nums[i]+nums[j]){
                    returnArr[0] = i;
                    returnArr[1] = j;
                    return returnArr;
                }
            }
        }
        return returnArr;
    }


    @Test
    public void testTwoSum(){
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum);
    }
}

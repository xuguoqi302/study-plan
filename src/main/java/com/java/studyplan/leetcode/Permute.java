package com.java.studyplan.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/5/20 15:29
 */
public class Permute {
    /**
     * 给定一个 没有重复 数字的序列，返回其所有可能的全排列
     * 输入: [1,2,3]  输出:
     * [
     *   [1,2,3],
     *   [1,3,2],
     *   [2,1,3],
     *   [2,3,1],
     *   [3,1,2],
     *   [3,2,1]
     * ]
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> countList = new LinkedList<>();
        if(nums.length==1){
            List<Integer> list = new LinkedList<>();
            list.add(nums[0]);
            countList.add(list);
            return countList;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new LinkedList<>();
            list.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    continue;
                }
                list.add(nums[j]);
            }
            countList.add(list);

        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new LinkedList<>();
            list.add(nums[i]);
            for (int j = nums.length-1; j >=0; j--) {
                if(nums[i]==nums[j]){
                    continue;
                }
                list.add(nums[j]);
            }
            countList.add(list);

        }
        return countList;
    }

    @Test
    public void test1(){
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }
}

package com.ronakp.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    /**
    Two Sum
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example:

    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    */
    public static void main(String[] args) {
        int[] nums = {2,5,7,9};
        int target = 9;
        System.out.println(Solution1(nums, target)[0]);
        System.out.println(Solution1(nums, target)[1]);
    }

    public static int[] Solution1(int[] nums, int target) {
        /**
        * Note: Solution1 can't handle duplicate values.
        * Time Complexity: O(n)
        * Space Complexity: O(n)
        */
        int[] answer = new int[2];
        HashMap<Integer, Integer> inputMap = new HashMap();
        for(int i = 0; i < nums.length; i++)
        {
            inputMap.put(nums[i], i);
        }
        for(Map.Entry<Integer, Integer> entry : inputMap.entrySet())
        {
            int complement = target - entry.getKey();
            if(inputMap.containsKey(complement))
            {
                answer[0] = entry.getValue();
                answer[1] = inputMap.get(complement);
                return answer;
            }
        }
        return answer;
    }
}
package com.prog2.labs;

import java.util.Arrays;

/**
 * @author adinashby
 *
 */

public class LabFour {
	
	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
    public int containerWithMostWater(int[] height) {
        return -1;
    }
    
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return closestSum;
                }
            }
        }
        return closestSum;
    }

    




    
}

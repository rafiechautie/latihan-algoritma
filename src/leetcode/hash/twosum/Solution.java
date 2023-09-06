package leetcode.hash.twosum;

import java.util.HashMap;
import java.util.Map;

    /**
     * Intuition
     * The Two Sum problem asks us to find two numbers in an array that sum up to a given target value.
     * We need to return the indices of these two numbers.
     *
     * Approach
     * 1. One brute force approach is to consider every pair of elements and check if their sum equals the target.
     * This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element,
     * and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).
     * 2. A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once,
     * and for each element, check if the target minus the current element exists in the hash table. If it does,
     * we have found a valid pair of numbers. If not, we add the current element to the hash table.
     * Approach using a hash table:
     *
     * 1. Create an empty hash table to store elements and their indices.
     * 2. Iterate through the array from left to right.
     * 3. For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
     * 4. Check if the complement exists in the hash table. If it does, we have found a solution.
     * 5. If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
     * Repeat steps 3-5 until we find a solution or reach the end of the array.
     * If no solution is found, return an empty array or an appropriate indicator.
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numMap = new HashMap<>();
            int n = nums.length;


            /**
             * n = 4, nums = [2, 7, 11, 15], target = 9
             *
             * i = 0; i < 4, complement = 9 - 2 = 7
             * if (numMap.containsKey(complement)) -> false
             * numMap {2=1, }
             *
             * i = 1; 1 < 4, complement = 9 - 7 = 2
             * if (numMap.containsKey(complement)) -> numMap.containesKey(2) -> true -> return numMapnya
             *
             * i = 2; 2 < 4, complement = 9 - 11 = -2
             *
             * i = 3; 3 < 4, complement = 9 - 15 = -6
             */
            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }

            return new int[]{}; // No solution found
        }
    }


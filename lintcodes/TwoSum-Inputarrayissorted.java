public class Solution {
    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

Example
Given nums = [2, 7, 11, 15], target = 9
return [1, 2]



     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int[] ret = new int[2];
        if (nums == null || nums.length < 2){
            return ret;
        }
        
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            if (nums[start] + nums[end] == target){
                ret[0] = start + 1;
                ret[1] = end + 1;
                return ret;
            }
            
            if (nums[start] + nums[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return ret;
    }
}

package Pattern_1_Two_Pointers;

//Pair with Target Sum (easy)
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

public class PairWithTargetSum {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}
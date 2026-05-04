package Pattern_1_Two_Pointers;

//26. Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
import java.util.*;

class Solutio {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }

        return i + 1;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements (sorted array expected)
        System.out.println("Enter elements (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solutio obj = new Solutio();
        int k = obj.removeDuplicates(nums);

        // Output result
        System.out.println("Number of unique elements: " + k);

        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
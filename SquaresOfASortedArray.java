package squaresofasortedarray;

import java.util.*;

/**
* @author keeganjones

Given an integer array nums sorted in non-decreasing order, return an array of 
the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

*/


public class SquaresOfASortedArray {

   public static int[] sortedSquares(int[] nums) {
       // create variable for length of array 
       int n = nums.length;
       
       // find the square value for each element of the array using a for loop
       for (int i = 0; i < n; i++)
           nums[i] = nums[i] * nums[i];
            
       // sort the array of squared elements in non-decreasing order.
       Arrays.sort(nums);
       
       // return the sorted squared array
       return nums;
        
    }
   
    public static void main(String[] args) {
        // create the array of ints and 
        int nums[] = { -8, -2, 3, 7, 9};
        
        // declare a variable to hold the length value of the array
        int n = nums.length;
 
        // print the array
        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
        
        // square and sort the array ints and print it
        sortedSquares(nums);
        System.out.println("");
        System.out.println("After Sort ");
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
    }
    
}

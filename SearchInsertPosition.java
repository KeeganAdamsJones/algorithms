
package searchinsertposition;
import java.util.Arrays;
/**
 *
 * @author keeganjones
 * 
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not, return the index where it would 
be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

 */
public class SearchInsertPosition {
 public static int searchInsert(int[] nums, int target) {
 
    int start = 0;
    int end = nums.length-1;
        
    while (start <= end) {
        int mid = (end + start) / 2;  // Find the halfway value
	
        // Comparisons 
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) start = mid + 1;
	else end = mid - 1;
    }
    
    return start;
     
    /*
    **********  This is my first attempt...correct but messy   **********
    var index1 = 0;
    var index2 = nums.length; // how many ints are in the array
    
    while (index2 > index1){
        var midpoint = ((index2 - index1) / 2) + index1; 
        
        if (midpoint <= index1) {
            if (nums[midpoint] < target) return index2;
        
            return index1;
        }
        
        // compare midpoint value to target value
        if(nums[midpoint] == target) { 
            return midpoint;
        }
        else if (nums[midpoint] < target){  
            index1 = midpoint;
        }
        else{                       
            index2 = midpoint;
        }       
    }                
    return index1;  
**********
*/
    }
    
    public static void main(String[] args) {
        //  ***** For Testing *****
        int [] nums = {1,3,5,6,9};
        int target = 6;
        
        var return_value = searchInsert(nums, target);

        System.out.println("Expected: 3  Actual: "+ return_value);
        
        int[] nums2 = {1};
        int target2 = 1;
        return_value = searchInsert(nums2, target2);

        System.out.println("Expected: 0  Actual: "+ return_value);
        
        int[] nums3 = {1,3,5,6};
        int target3 = 1;
        return_value = searchInsert(nums3, target3);

        System.out.println("Expected: 0  Actual: "+ return_value);
        
        int[] nums4 = {1,3,5,6};
        int target4 = 4;
        return_value = searchInsert(nums4, target4);

        System.out.println("Expected: 2  Actual: "+ return_value);
        
        int[] nums5 = {3,7,12,18,21};
        int target5 = 15;
        return_value = searchInsert(nums5, target5);

        System.out.println("Expected: 3  Actual: "+ return_value);
        
    }
}

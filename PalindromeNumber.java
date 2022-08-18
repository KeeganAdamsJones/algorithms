
package palindromenumber;

/**
 *
 * @author keeganjones

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.

* Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

* Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 
* 121-. Therefore it is not a palindrome.

* Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
* Constraints:
-231 <= x <= 231 - 1

 */

// This is my second solution using a boolean.
public class PalindromeNumber {
    public boolean isPalindrome(int original){
        if(original < 0) return  false; 
        
        original = 122;
        int number = original;
        int remainder = 0;
        int reversed = 0;
        
            while(original != 0) {  // Set to while not 0 so that it will continue to re-itterate until 0
                 remainder = number % 10;  // divide number by ten and get remainder value
                 reversed = reversed * 10 + remainder; //  number reversed so far on each itteration
                 number  /= 10;  
             }
         // palindrome if original and reversed are equal
         return original == reversed;
     }
    public static void main(String[] args) {
        
    }
}

/*
//This is my first solution, but it is not a boolean.

public class PalindromeNumber {
    public static void main(String[] args) {
        // set variable values 
        int givenNumber = 12345;
        int number = givenNumber;
        int reverse = 0;  
    
        // negative numbers cannot be a palindrome
        if(givenNumber < 0){
            System.out.println("This number is not a palindrome.");
            
        }
        // steps to reverse the order of the given number
        while(number != 0) { // Set to while not 0 so that it will continue to re-itterate until 0
                int remainder = number % 10; // divide number by ten and get remainder
                reverse = reverse * 10 + remainder; //  number reversed so far on each itteration
                number = number/10;  
        }  
      
        
        if(givenNumber == reverse){
            System.out.println("This number is a palindrome.");
        }
        else if(givenNumber != reverse){
            System.out.println("This number is not a palindrome");
        }
    }
}
*/       
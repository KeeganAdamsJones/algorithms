
package validparentheses;

import java.util.Stack;

/**
 * @author keeganjones
 
Given a string s containing just the characters '(', ')', '{', '}', '[' and 
']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

* Example 1:
Input: s = "()"
Output: true

* Example 2:
Input: s = "()[]{}"
Output: true

* Example 3:
Input: s = "(]"
Output: false

 */


public class ValidParentheses {
    public boolean isValid(String s) {
        
        int size = s.length();  //  Create a variable for the length of given string.
        
        Stack<Character> st = new Stack<>();  // Declare a character stack
        
        if(size%2!=0){  //  If the length of the given string is not even, then it cannot be balanced.
            return false;  // If the string is not even/balanced then it is not valid.
        }
        
        int i=0;  //  Traverse the given string.
        while(i<size){
            char check = s.charAt(i);  //  Check the char at current location in given string.
            if(check =='(' || check =='[' || check=='{'){  // if it is an opening paren, bracket or brace
                st.push(check);  // add the character to the stack
            }
            
            /* if the current location char is a closing paren, AND the stack is not 
            empty AND the first element of the stack is an open paren then pop from top of stack.
            */
            else if(check ==')'  && !st.empty() && '(' ==st.peek()){  
                st.pop();
            }
            
            /* if the current location char is a closing bracket, AND the stack is not 
            empty AND the first element of the stack is an open bracket then pop from top of stack. 
            */
            else if(check ==']'  && !st.empty() && '[' ==st.peek()){
                st.pop();
            }
            
            /* if the current location char is a closing brace, AND the stack is not 
            empty AND the first element of the stack is an open brace then pop from top of stack. 
            */
            else if(check =='}'  && !st.empty() && '{' ==st.peek()){
                st.pop();
            }
            
            //  If none of the above were true then it is not valid.
            else{
                return false; // any return will end the entire function.
            }
                  
            i++;  // increment to next char in given string.
        }
      
            /* if the stack is NOT empty at the end then it is 
               not valid because number of opens was not equal to number of closes.
            */
            if(!st.empty()){  
              return false;
              }
              return true;  // otherwise the stack is empty because the # of opens was the same as # of closes.
    }
    public static void main(String[] args) {
        
    }
    
}

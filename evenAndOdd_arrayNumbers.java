/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author keeganjones
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	System.out.println("The Whole Numbers Included in My Array Are:");
	System.out.println(array1);
	
        System.out.println("Values of My Array That Are Even:");
	for(int i=0;i<array1.length;i++){  
            if(array1[i]%2==0){ 
		System.out.println(array1[i]);  
	
            }
        }
        
	System.out.println("Values of My Array That Are Odd:");


	for(int i=0;i<array1.length;i++){  
            if(array1[i]%2!=0){  
		System.out.println(array1[i]);
            }
	}  
    }
    
}

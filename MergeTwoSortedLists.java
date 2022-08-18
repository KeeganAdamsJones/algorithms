
package mergetwosortedlists;

import java.util.LinkedList;

/**
 *
 * @author keeganjones
 */


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        // if Either list is null, then simply return the other list as is.
        if (list1 == null) {
            return list2;
        }
        
        if (list2 == null) {
            return list1;
        }
        
        ListNode start;
        // start at the beginning of each list and compare the values and move to the next value.
        if(list1.val > list2.val) { 
            start = list2;  // if val 2 is less move it to the head 
            list2 = list2.next;  // and advance to the next value in list 2
        }else {
            start = list1;  // if val 1 is less move it to the head 
            list1 = list1.next;  // and advance to the next value in list 1
        }
        
        /*
        List 1: <4> <7>  < 400>
        List 2: <14> <200> <4830>
        
        New List
        <start:4> - <node:7> - <node:14> - <current_node (200)>
        
        */
        
        ListNode currentNode;  // new merged linked list
        currentNode = start;
        
        /* 
        while there are remaining values in BOTH lists, compare the values 
        that you are currently on and move the smaller one to the next location of head.
        */  
        while(list1 != null && list2 !=null) {  
            
            if(list1.val > list2.val) {
                currentNode.next = list2;
                currentNode = currentNode.next;
                list2 = list2.next;
            } else {
                currentNode.next = list1;
                currentNode = currentNode.next;
                list1 = list1.next;
            }
        }
        
        /* if lists 1 & 2 are not equal length, once one list becomes empty, 
        append the rest of the other list
        */
        
        if(list1 != null){
            currentNode.next = list1;
        }
        if(list2 != null) {
            currentNode.next = list2;
        }
        // TO DO:
        return start;
    
    }
    
    public static void main(String[] args) {
        // for testing
        
        // 23->35->65 LinkedList created
        ListNode head1 = new ListNode(23);
        head1.next = new ListNode(35);
        head1.next.next = new ListNode(65);
 
        // 43->59->60 LinkedList created
        ListNode head2 = new ListNode(43);
        head2.next = new ListNode(59);
        head2.next.next = new ListNode(60);
 
        // TO DO: 
        ListNode mergedhead = mergeTwoLists(head1, head2);
 
        System.out.println(mergedhead);
 
    }
    
}

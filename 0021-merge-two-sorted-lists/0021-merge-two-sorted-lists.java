/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode resultIterator = null;
        if(list2 == null) return list1;
        else if(list1 == null) return list2;

        if(list1.val<list2.val){
            head = list1;
            list1 = list1.next;
        } 
        else {
            head = list2;
            list2 = list2.next;
        }
        resultIterator = head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val) {
                resultIterator.next = list1;
                list1 = list1.next; 
            }
            else {
                resultIterator.next = list2;
                list2 = list2.next;
            }
            resultIterator = resultIterator.next;
        }
        while(list1!=null){
                resultIterator.next = list1;
                list1 = list1.next; 
                resultIterator = resultIterator.next;
        }
          while(list2!=null){
                resultIterator.next = list2;
                list2 = list2.next; 
                resultIterator = resultIterator.next;
        }
    return head;
    }
   
}
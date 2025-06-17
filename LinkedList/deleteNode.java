package LinkedList;

public class deleteNode {
    
//  * Definition for singly-linked list. 
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 //DELETE NODE WHEN HEAD IS NOT GIVEN ONLY NODE IS GIVEN 

    public void deleteNode(ListNode node) {
        node.val= node.next.val;
        node.next= node.next.next;
    }
}

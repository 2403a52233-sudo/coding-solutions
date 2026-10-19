/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ArrayList<ListNode> al=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
       for(int i=0;i<al.size();i++){
        if(al.get(i)==temp) return temp;
       }
        al.add(temp);
        temp=temp.next;
       }
       return null;
    }
}
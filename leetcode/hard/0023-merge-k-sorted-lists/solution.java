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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al=new ArrayList<>();
     
        for(int i=0;i<lists.length;i++){
               ListNode temp=lists[i];
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        }
        Collections.sort(al);

        ListNode nh=null;
        ListNode t=null;
        for(int x:al){
            ListNode n=new ListNode(x);
            if(nh==null){
                nh=n;
                t=n;
            }
            else{
                t.next=n;
                t=n;
            }
        }

       return nh; 
    }
}
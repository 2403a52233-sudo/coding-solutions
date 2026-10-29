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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=k-1;
        while(j<al.size()){
            int l=i;
            int r=j;
            while(l<r){
            int tem=al.get(l);
            al.set(l,al.get(r));
            al.set(r,tem);
            l++;r--;
        }
        i+=k;
        j+=k;
        }
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
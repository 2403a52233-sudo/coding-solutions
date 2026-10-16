# Reverse Nodes in k-Group

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given the `head` of a linked list, reverse the nodes of the list `k` at a time, and return  *the modified list*.

`k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

```

 

 **Constraints:** 

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

 

 **Follow-up:**  Can you solve the problem in `O(1)` extra memory space?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 2.95%)  
**Memory:** 45.7 MB (beats 98.93%)  
**Submitted:** 2026-10-16T13:51:21.594Z  

```java
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
            l++;
            r--;
        }
        i+=k;
        j+=k;
        }
        i=0;
        temp=head;
        while(temp!=null){
            temp.val=al.get(i);
            i++;
            temp=temp.next;
        }
    return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-nodes-in-k-group/)
# Merge k Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

 *Merge all the linked-lists into one sorted linked-list and return it.* 

 

 **Example 1:** 

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

```

 **Example 2:** 

```
Input: lists = []
Output: []

```

 **Example 3:** 

```
Input: lists = [[]]
Output: []

```

 

 **Constraints:** 

- k == lists.length
- 0 <= k <= 104
- 0 <= lists[i].length <= 500
- -104 <= lists[i][j] <= 104
- lists[i] is sorted in ascending order.
- The sum of lists[i].length will not exceed 104.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 19.76%)  
**Memory:** 45.7 MB (beats 99.22%)  
**Submitted:** 2026-10-29T02:51:56.668Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)
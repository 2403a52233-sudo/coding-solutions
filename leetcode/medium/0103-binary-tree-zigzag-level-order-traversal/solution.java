/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
            int c=0;
        while(!q.isEmpty()){
            int n=q.size();
        
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode cur=q.remove();
                al.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
                if(c%2==1){
                    int i=0;
                    int j=al.size()-1;
                    while(i<j){
                        int temp=al.get(i);
                        al.set(i,al.get(j));
                        al.set(j,temp);
                        i++;
                        j--;
                    }
                }
                ans.add(al);
                c++;
        
        }
        return ans;
    
    }
}
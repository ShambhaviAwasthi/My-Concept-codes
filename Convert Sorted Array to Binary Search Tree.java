// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
    public TreeNode build(int[] nums,int start,int end){
        if(start>end) return null;
        
            int mid=start+(end-start)/2;
            TreeNode root=new TreeNode(nums[mid]);
           root.left = build(nums,start,mid-1);
        root.right=build(nums,mid+1,end);
        return root;
    
       
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return build(nums,0,nums.length-1);
       
    }
}

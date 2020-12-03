class Solution {
    TreeNode prev=null, head=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;   
        increasingBST(root.left);  
        if(prev!=null) { 
        	root.left=null; 
        	prev.right=root; 
        }
        if(head==null) head=root; 
        prev=root; 
        increasingBST(root.right); 
        return head;
    }
}
class Solution {
    Map<TreeNode, Integer> map = new HashMap<>();

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;
        
        int leftD = depth(root.left);
        int rightD = depth(root.right);
        
        if (leftD == rightD) return root;
        
        else if (leftD > rightD) return subtreeWithAllDeepest(root.left);
        
        else if (leftD < rightD) return subtreeWithAllDeepest(root.right);
        
        return null;
    }
    
    private int depth(TreeNode root) {
        if (root == null) return 0;
        
        if (map.containsKey(root)) return map.get(root);
        
        int leftD = depth(root.left);
        int rightD = depth(root.right);
        
        int depth = Math.max(leftD, rightD) + 1;
        
        map.put(root, depth);
        
        return depth;
    }
}
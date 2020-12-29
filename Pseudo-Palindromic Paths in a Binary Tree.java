class Solution {
    int count = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        dfs(root, new ArrayList());
        return count;
    }

    private void dfs(TreeNode root, List<Integer> path) {
        if (root == null)
            return;
        List<Integer> newPath = new ArrayList(path);
        newPath.add(root.val);
        if (root.left == null && root.right == null) {
            count += isPseudoPalindromicPaths(newPath) ? 1 : 0;
            return;
        }
        dfs(root.left, newPath);
        dfs(root.right, newPath);
    }

    private boolean isPseudoPalindromicPaths(List<Integer> path) {
        int[] frequency = new int[10];
        for (int i : path)
            frequency[i]++;
        return Arrays.stream(frequency).filter(x -> x % 2 == 1).count() <= 1;
    }
}

class Solution {
  public Node connect(Node root) {
    List<Node> nodes = new ArrayList<>();
    dfs(root, 0, nodes);
    return root;
  }
  
  private void dfs(Node root, int depth, List<Node> nodes) {
    if (null == root) return;
    if (depth >= nodes.size()) 
      nodes.add(root);
    else {
      nodes.get(depth).next = root;
      nodes.set(depth, root);
    }  
    dfs(root.left,  depth + 1, nodes);
    dfs(root.right, depth + 1, nodes);
  }
}
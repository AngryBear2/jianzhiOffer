import java.util.HashMap;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 *
 * <p>假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Offer07 {
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  int[] preorder;
  HashMap<Integer, Integer> dic = new HashMap<>();

  /**
   * 分治算法 根据先序遍历根节点在中序遍历中的索引 位于其左面是其左子树 位于其右面是其柚子树 再分别找到每个子树的根节点继续计算其左子树与右子树
   *
   * @param preorder
   * @param inorder
   * @return
   */
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    this.preorder = preorder;
    for (int i = 0; i < inorder.length; i++) {
      dic.put(inorder[i], i);
    }
    return recur(0, 0, inorder.length - 1);
  }

  TreeNode recur(int root, int left, int right) {
    if (left > right) {
      return null;
    }
    TreeNode treeNode = new TreeNode(preorder[root]);
    int i = dic.get(preorder[root]);
    treeNode.left = recur(root + 1, left, i - 1);
    treeNode.right = recur(root + i - left + 1, i + 1, right);
    return treeNode;
  }
}

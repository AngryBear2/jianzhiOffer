import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class Offer32A {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        TreeNode first;
       while(!queue.isEmpty()){
           first = queue.getFirst();
           if(first.left!=null){
               queue.addLast(first.left);
           }
           if(first.right!=null){
               queue.addLast(first.right);
           }
           list.add(queue.removeFirst().val);

       }
        Integer[] integers = list.toArray(new Integer[0]);
        int[] result = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
        return result;

    }
}

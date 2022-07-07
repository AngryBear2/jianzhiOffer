import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class Offer32B {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        TreeNode first;
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size= queue.size();
            for(int i=0;i< size;i++){
                first = queue.getFirst();
                if(first.left!=null){
                    queue.addLast(first.left);
                }
                if(first.right!=null){
                    queue.addLast(first.right);
                }
                list.add(queue.removeFirst().val);
            }
            result.add(list);


        }
        return result;
    }
}

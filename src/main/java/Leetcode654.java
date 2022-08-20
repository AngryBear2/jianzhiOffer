import util.TreeNode;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 *
 * <p>创建一个根节点，其值为 nums 中的最大值。 递归地在最大值 左边 的 子数组前缀上 构建左子树。 递归地在最大值 右边 的 子数组后缀上 构建右子树。 返回 nums 构建的
 * 最大二叉树 。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/maximum-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode654 {
  public static void main(String[] args) {
   Leetcode654 leetcode654 = new Leetcode654();
   int[] nums={3,2,1,6,0,5};
   leetcode654.constructMaximumBinaryTree(nums);
  }

 public TreeNode constructMaximumBinaryTree(int[] nums) {
   TreeNode head=new TreeNode(nums[0]);
   TreeNode temp;
   for(int i=1;i<nums.length;i++){
     if(nums[i]>head.val){
      temp=head;
      head=new TreeNode(nums[i]);
      head.left=temp;
     }else if(head.right==null){
       head.right=new TreeNode(nums[i]);
     }else{
       temp=head;
       while(temp.right!=null&&temp.right.val>nums[i]){
         temp=temp.right;
       }
      TreeNode treeNode = new TreeNode(nums[i]);
      if (temp.right != null) {
       treeNode.left = temp.right;
      }
      temp.right=treeNode;
     }
   }
  return head;

 }
}

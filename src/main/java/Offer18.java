/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * <p>返回删除后的链表的头节点。
 */
public class Offer18 {
  public ListNode deleteNode(ListNode head, int val) {
    ListNode currentNode = head;
    ListNode preNode = null;
    while (currentNode != null) {
      if (currentNode.val == val) {
        if (preNode == null) {
          return head.next;
        } else {
          preNode.next = currentNode.next;
          return head;
        }
      } else {
        preNode = currentNode;
        currentNode = currentNode.next;
      }
    }
    return head;
  }
}

/** 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 */
public class Offer24 {
  private class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode reverseList(ListNode head) {
    ListNode node = head;
    ListNode pre = null;
    ListNode temp;
    while (node != null) {
      temp = node.next;
      node.next = pre;
      pre = node;
      node = temp;
    }
    return node;
  }
}

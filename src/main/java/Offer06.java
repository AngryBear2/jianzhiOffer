import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 */
public class Offer06 {
  static int index = 0;
  static int length = 0;
  static int[] array;

  public int[] reversePrint(ListNode head) {

    List<Integer> list = new ArrayList<>();
    ListNode current = head;

    while (current != null) {
      list.add(current.val);
      current = current.next;
    }
    Collections.reverse(list);
    int[] result = list.stream().mapToInt(Integer::intValue).toArray();
    return result;
  }

  // 递归法
  public int[] reversePrint2(ListNode head) {
    nextNode(head);
    return array;
  }

  public static void nextNode(ListNode current) {
    if (current != null) {
      length++;
      nextNode(current);
      array[index] = current.val;
      index++;
    } else {
      array = new int[length];
    }
  }

  public static void main(String[] args) {
    Offer06 offer06 = new Offer06();
    offer06.reversePrint2(null);
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

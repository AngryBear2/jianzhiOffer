import java.util.Stack;

/** 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中， 调用 min、push 及 pop 的时间复杂度都是 O(1)。 */
public class Offer30 {
  class MinStack {

    Stack<Integer> a, b;
    /** initialize your data structure here. */
    public MinStack() {
      a = new Stack<>();
      b = new Stack<>();
    }

    public void push(int x) {
      a.push(x);
      if (b.empty() || b.peek() >= x) {
        b.push(x);
      }
    }

    public void pop() {
      /*
      如果使用==则无法通过 [-128,127] 会被cache缓存 超出值的话 比较对象是不是一个
      if (obj instanceof Integer) {
          return value == ((Integer)obj).intValue();
      }
       */
      if (a.pop().equals(b.peek())) {
        b.pop();
      }
    }

    public int top() {
      return a.peek();
    }

    public int min() {
      return b.peek();
    }
  }
}

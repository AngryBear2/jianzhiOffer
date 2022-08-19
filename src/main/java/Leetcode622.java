import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 *
 * <p>循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，
 * 即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 *
 * <p>你的实现应该支持如下操作：
 *
 * <p>MyCircularQueue(k): 构造器，设置队列长度为 k 。 Front: 从队首获取元素。如果队列为空，返回 -1 。 Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。 deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。 isEmpty():
 * 检查循环队列是否为空。 isFull(): 检查循环队列是否已满。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/design-circular-queue
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 不能使用arrayList 因为arrayList的add(),set(),index必须大于size()，size为arrayList中元素数
 */
public class Leetcode622 {
  public static void main(String[] args) {
      Leetcode622 leetcode622 = new Leetcode622(6);
      leetcode622.enQueue(6);
      leetcode622.Rear();
      leetcode622.Rear();
      leetcode622.deQueue();
      leetcode622.enQueue(5);
      leetcode622.Rear();
      leetcode622.deQueue();
      leetcode622.Front();
      leetcode622.deQueue();
      leetcode622.deQueue();
      leetcode622.deQueue();
  }

    int head;
    int tail;
    int length;
    int[] myQueue;
    public Leetcode622(int k) {
        myQueue=new int[k];
        head=0;
        tail=0;
        length=k;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        myQueue[tail]=value;
        if(tail+1>=length){
            tail=0;
        }else{
            tail++;
        }
        return true;

    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        myQueue[head]=0;
        if(head+1>=length){
            head=0;
        }else{
            head++;
        }
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return myQueue[head];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(tail-1<0){
            return myQueue[length-1];
        }else{
            return myQueue[tail-1];
        }
    }

    public boolean isEmpty() {
        return length==0||(head==tail&&myQueue[tail]==0);
    }

    public boolean isFull() {
        return length==0||(Rear()>0&&head==tail);
    }
}

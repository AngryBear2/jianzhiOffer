/** 统计一个数字在排序数组中出现的次数。 */
public class Offer53A {
  public int search(int[] nums, int target) {
    int result = 0;
    boolean flag = false;
    for (int num : nums) {
      if (num == target) {
        flag = true;
        result++;
      } else if (flag && num != target) {
        break;
      }
    }
    return result;
  }
}

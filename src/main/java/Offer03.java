import java.util.HashSet;

/**
 * 找出数组中重复的数字。
 *
 * <p>在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了， 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer03 {
  /**
   * 使用hashSet找到重复值 不能使用List list.add()时间复杂度为O(N)
   *
   * @param nums
   * @return
   */
  public static int findRepeatNumber(int[] nums) {
    HashSet<Integer> allSet = new HashSet<>();
    int result = -1;
    for (int num : nums) {
      if (!allSet.add(num)) {
        result = num;
        break;
      }
    }
    return result;
  }

  /** 交换索引法 */
  public static int findRepeatNumber2(int[] nums) {
    int result = -1;
    int temp;
    int num = 0;
    while (num < nums.length) {
      if (nums[num] == num) {
        num++;
        continue;
      }
      if (nums[nums[num]] == nums[num]) {
        result = nums[num];
        break;
      } else {
        temp = nums[num];
        nums[num] = nums[nums[num]];
        nums[temp] = temp;
        num++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 4, 2, 0, 0, 1};
    System.out.println(findRepeatNumber2(nums));
  }
}

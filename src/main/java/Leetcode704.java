/**
 *给定一n个元素有序的（升序）整型数组nums 和一个目标值target，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode704 {
    public int search(int[] nums, int target) {
        int result=-1;
        int left=0;
        int right=nums.length-1;
        int middle;
        while(left<=right){
            middle=(left+right)/2;
            if(nums[middle]==target){
                result=middle;
                break;
            }else if(target<nums[middle]){
                right=--middle;
            }else if(target>nums[middle]){
                left=++middle;
            }
        }
        return result;
    }

  public static void main(String[] args) {
      Leetcode704 leetcode704 = new Leetcode704();
      int[] nums={-1,0,3,5,9,12};
    System.out.println(leetcode704.search(nums,2));

  }
}

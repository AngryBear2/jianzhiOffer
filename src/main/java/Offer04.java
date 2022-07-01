/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer04 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 1}};
    int target = 0;
    Offer04 offer04 = new Offer04();
    offer04.findNumberIn2DArray(matrix, target);
  }

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix.length == 0) {
      return false;
    }
    int x = matrix[0].length - 1;
    int y = 0;
    while (x >= 0 && y < matrix.length) {
      if (matrix[y][x] == target) {
        return true;
      } else if (x == 0 && y == matrix.length - 1) {
        return false;
      } else if (matrix[y][x] < target) {
        y++;
        continue;
      } else if (matrix[y][x] > target) {
        x--;
        continue;
      }
    }
    return false;
  }
}

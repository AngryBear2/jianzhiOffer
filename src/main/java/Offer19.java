/**
 * 请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/zheng-ze-biao-da-shi-pi-pei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer19 {
  private boolean isMatch(String s, String p) {
    int sLength = s.length();
    int pLength = p.length();
    int sIndex = 0;
    int pIndex = 0;
    while (sIndex < sLength) {
      if (pIndex == pLength) {
        return false;
      }
      if (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.') {
        sIndex++;
        pIndex++;
        continue;
      }
      if (p.charAt(pIndex) == '*') {
        if (pIndex == 0) {
          return false;
        }
        if (p.charAt(pIndex - 1) == s.charAt(sIndex) || p.charAt(pIndex - 1) == '.') {
          sIndex++;
          pIndex++;
          continue;
        }
        if (p.charAt(pIndex - 1) == s.charAt(sIndex - 1)) {
          pIndex++;
          continue;
        }
        return false;
      }

      pIndex++;
      if (pIndex == pLength) {
        return false;
      }
      if (p.charAt(pIndex) == '*') {
        pIndex++;
        continue;
      }
    }
    while (pIndex < pLength) {
      if (p.charAt(pIndex) != '*' || isaBoolean(p, pIndex)) {
        return false;
      }
      pIndex++;
    }
    return true;
  }

  private boolean isaBoolean(String p, int pIndex) {
    if (pIndex + 1 == p.length()) {
      return false;
    }
    return p.charAt(pIndex + 1) != '*';
  }

  public static void main(String[] args) {
    Offer19 offer19 = new Offer19();
    offer19.isMatch("aaa", "aaaa");
    System.out.println();
  }
}

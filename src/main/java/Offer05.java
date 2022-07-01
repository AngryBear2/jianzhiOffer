/** 请实现一个函数，把字符串 s 中的每个空格替换成"%20" */
public class Offer05 {
  public String replaceSpace(String s) {
    String regex = "\\s";
    String result = s.replaceAll(regex, "%20");
    return result;
  }
}

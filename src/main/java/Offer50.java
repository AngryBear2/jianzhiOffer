import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母
 */
public class Offer50 {
    public static void main(String[] args) {
        Offer50 offer50 = new Offer50();
        offer50.firstUniqChar("leetcode");
    }
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';

    }
}

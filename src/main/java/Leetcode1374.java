/**
 * 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 *
 * <p>返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
 *
 * <p>来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/generate-a-string-with-characters-that-have-odd-counts
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode1374 {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                stringBuilder.append('a');
            }
            stringBuilder.append('b');
        }else{
            for(int i=0;i<n;i++){
                stringBuilder.append('a');
            }
        }
        return stringBuilder.toString();
    }
}

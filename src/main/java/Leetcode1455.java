/**
 * 给你一个字符串 sentence 作为句子并指定检索词为 searchWord
 * ，其中句子由若干用 单个空格 分隔的单词组成。请你检查检索词 searchWord 是否为句子 sentence
 * 中任意单词的前缀。
 *
 * <p>如果searchWord 是某一个单词的前缀，则返回句子sentence 中该单词所对应的下标（下标从 1 开始）。
 * 如果 searchWord
 * 是多个单词的前缀，则返回匹配的第一个单词的下标（最小下标）。如果 searchWord 不是任何单词的前缀，则返回 -1 。
 *
 * <p>字符串 s 的 前缀 是 s 的任何前导连续子字符串。
 *
 * <p>来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
     for1:   for(int i=0;i<s.length;i++){
            if(s[i].length()<searchWord.length()){
                continue;
            }
            for(int j=0;j<searchWord.length();j++){
                if(searchWord.charAt(j)!=s[i].charAt(j)){
                    continue for1;
                }
            }
            return i+1;
        }
        return -1;
    }
}
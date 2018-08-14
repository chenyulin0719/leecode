import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_3 implements Solution {
    //Longest Substring Without Repeating Characters
    public void solve() {

        System.out.println("Problem3:");
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";
        String input4 = "abba";

        System.out.println("Brute solution");
        assert lengthOfLongestSubstring1(input1) == 3;
        assert lengthOfLongestSubstring1(input2) == 1;
        assert lengthOfLongestSubstring1(input3) == 3;
        assert lengthOfLongestSubstring1(input4) == 2;
        System.out.println("Brute solution passed.");

        System.out.println("Sliding solution");
        assert lengthOfLongestSubstring2(input1) == 3;
        assert lengthOfLongestSubstring2(input2) == 1;
        assert lengthOfLongestSubstring2(input3) == 3;
        assert lengthOfLongestSubstring2(input4) == 2;
        System.out.println("Sliding solution passed.");

        System.out.println("HashMap solution");
        assert lengthOfLongestSubstring3(input1) == 3;
        assert lengthOfLongestSubstring3(input2) == 1;
        assert lengthOfLongestSubstring3(input3) == 3;
        assert lengthOfLongestSubstring3(input4) == 2;

        System.out.println("HashMap solution passed.");
    }

    //想不出來，嗚嗚嗚
    public int lengthOfLongestSubstring3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        int ans = 0;

        //往右移動(i,j-1) 如果是最短字串，當 j 往又平移時，如果遇到重複字元，
        //第一: 跳過前一個重複的字元使 i = map.get(s.charAt(j))
        //第二: j 和  map.get(s.charAt(j)) 間可能有其他重複字元發生，使得i > map.get(s.charAt(j))
        //(ex: abba ，即使跳過第一個a，選擇bba，仍有重複字元出現)
        //(每次出現重複字元時就要移動i的位置是(不是跳過前個字元，就是用前一次處理得結果))
        //abb的時候把i移動到2
        //abba時就不會用a'b'ba，而是ab'b'a
        //-> i = Math.max(map.get(s.charAt(j)),i);

        for (int j = 0, i = 0; j < length; j++) {
            if (map.containsKey(s.charAt(j))) {
//                i = map.get(s.charAt(j));
//                用上面這行的話，當input 是 abba，放j=3時， i= 2，s.charAt(j)=1，答案會錯
//                i 是上個最短字串的起點，s.charAt(j)是要繼續尋找時新的起點
                i = Math.max(map.get(s.charAt(j)),i);
//                System.out.println("change i="+i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);  //記錄此字元在出現時該從何處開始
            //value j+1 代表是不含該字元的下個起點

        }
        return ans;
//        while (i < length && j < length) {
//            char ch = s.charAt(j);
//            if (map.containsKey(ch)) {
//                map.put(ch,Math.max(map.get(ch),j));
//                i++;
//                //關鍵: HashMap 的 value 代表這個字元所在的最大位數
//                //下次loop 就是檢查 (i++,j)
//            } else {
//                map.add(ch, );
//                j++;
//            }
//        }
//        return ans = Math.max(ans, map.size());
    }

    //Sliding Window (沒想到，抄來的), 用 i/j 兩個 index不斷改變字串範圍
    //核心概念 : [i,j+1] 可透過 [i,j] 結果判斷是否有重複字串，檢查一個字元即可
    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < length && j < length) {
            char ch = s.charAt(j);
            if (set.contains(ch)) {
                ans = Math.max(ans, set.size());
                set.remove(s.charAt(i));
                i++;
                //關鍵: 此處(i++,j) ,因為 (i,j-1)是substring，可依照 (i++,j-1) 一定是substring
                //下次loop 就是檢查 (i++,j)
            } else {
                set.add(ch);
                j++;
            }
        }
        return ans = Math.max(ans, set.size());
    }

    //Brute solution (O^3)
    public int lengthOfLongestSubstring1(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Null input string.");
        }

        int length = s.length();
        int ans = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                ans = checkNoRepeatSubstring(s, i, j) && ((j - i + 1) > ans) ? j - i + 1 : ans;
            }
        }
        return ans;
    }

    private boolean checkNoRepeatSubstring(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}

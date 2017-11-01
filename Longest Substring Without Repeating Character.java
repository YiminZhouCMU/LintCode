public class Solution {
    /*
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        
        int i = 0;
        int j = 0;
        
        int result = 0;
        
        for (i = 0; i < s.length(); i++) {
            while (j < s.length() && (map[s.charAt(j)] == 0)) {
                map[s.charAt(j)] = 1;
                result = Math.max(result, j - i + 1);
                j++;
            }
            map[s.charAt(i)] = 0;
        }
        
        return result;
    }
}
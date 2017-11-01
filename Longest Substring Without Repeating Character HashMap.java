public class Solution {
    /*
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        int i = 0;
        int j = 0;
        
        int result = 0;
        
        for (i = 0; i < s.length(); i++) {
            while (j < s.length() && (map.get(s.charAt(j)) == null)) {
                map.put(s.charAt(j), 1);
                result = Math.max(result, j - i + 1);
                j++;
            }
            map.remove(s.charAt(i));
        }
        
        return result;
    }
}
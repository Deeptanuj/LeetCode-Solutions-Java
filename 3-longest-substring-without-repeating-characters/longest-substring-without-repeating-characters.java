class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        List<Character> list = new ArrayList<Character>();
        while(r < s.length()){
            while(list.contains(s.charAt(r))){
                list.remove(Character.valueOf(s.charAt(l)));
                l++;
            }
            list.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
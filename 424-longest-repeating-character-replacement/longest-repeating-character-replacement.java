class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = Integer.MIN_VALUE;
        int maxf = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxf = max(maxf, map.get(s.charAt(r)));
            while((r - l + 1) - maxf > k && l <= r){
                if(map.get(s.charAt(l)) == 1) map.remove(s.charAt(l));
                else map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                maxf = 0; //RESET
                for(int f : map.values()){
                    maxf = max(maxf, f);
                }
                l++;
            }
            maxlen = max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
    private int max(int a, int b){
        return (a > b) ? a : b;
    }
}
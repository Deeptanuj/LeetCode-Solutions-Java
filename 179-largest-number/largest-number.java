class Solution {
    public String largestNumber(int[] nums) {
       List<String> list = new ArrayList<String>();
       for(int num : nums){
        list.add(String.valueOf(num));
       } 
       Collections.sort(list, (a, b) -> compare(a, b));
       String ans = String.join("", list); //New Feature I learned
       return allZeros(ans) ? "0" : ans;
    }

    private static boolean allZeros(String s){
        for(char i : s.toCharArray()){
            if(i != '0') return false;
        }
        return true;
    }

    private static int compare(String a, String b){
        int l = 0;
        int r = 0;
        while(l < a.length() || r < b.length()){
            if(l == a.length()) l = 0;
            if(r == b.length()) r = 0;
            if(a.charAt(l) > b.charAt(r)) return -1;
            if(a.charAt(l) < b.charAt(r)) return 1;
            l++;
            r++;
        }
        return 0;
    }
}
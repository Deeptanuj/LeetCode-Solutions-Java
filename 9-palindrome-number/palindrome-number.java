class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder sb = new StringBuilder(num);
        return sb.toString().equals(sb.reverse().toString());
    }
}
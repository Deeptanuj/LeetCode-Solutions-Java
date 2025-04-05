class Solution {
    public int mySqrt(int x) {
        //USING BINARY SEARCH
        if(x == 0) return 0;

        int l = 1;
        int r = x;
        //if mid * mid = x (means mid is sqrt of x) => Therefore mid = x / mid (This logic will be used)
        while(l <= r){
            int m = l + (r - l) / 2;

            if(m == x / m) return m;

            else if(m < x / m) l = m + 1;
            else r = m - 1;
        }

        return r; //as per given if ans is 2.828 then round it to 2 means m - 1 which is r 
    }
}
class Solution {
    public int[] closestPrimes(int left, int right) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(left >= right) return ans;

        int isprime[] = new int[right + 1];
        for(int i = 2; i < right + 1; i++){
            isprime[i] = 1;
        }

        for(int i = 2; i * i < right + 1; i++){
            if(isprime[i] == 1){
                for(int j = i * i; j < right + 1; j += i){
                    isprime[j] = 0;
                }
            }
        }

        ArrayList<Integer> prime = new ArrayList<Integer>();
        for(int i = left; i < right + 1; i++){
            if(isprime[i] == 1) prime.add(i);
        }

        int mindiff = Integer.MAX_VALUE;
        for(int i = 1; i < prime.size(); i++){
            if((prime.get(i) - prime.get(i - 1)) < mindiff){
                mindiff = prime.get(i) - prime.get(i - 1);
                ans[0] = prime.get(i - 1);
                ans[1] = prime.get(i);
            }
        }

        return ans;
    }
}
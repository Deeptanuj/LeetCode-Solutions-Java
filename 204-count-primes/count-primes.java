class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1) return 0;
        int prime[] = new int[n + 1];
        for(int i = 2; i < n + 1; i++){
            prime[i] = 1;
        }

        for(int i = 2; i*i <= n; i++){
            if(prime[i] == 1){
                for(int j = i * i; j < n + 1; j += i){
                    prime[j] = 0;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++){
            if(prime[i] == 1) count++;
        }
        return count;
    }
}
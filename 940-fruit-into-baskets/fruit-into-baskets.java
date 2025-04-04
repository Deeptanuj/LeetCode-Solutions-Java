class Solution {
    public int totalFruit(int[] fruits) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size() > 2){
                if(map.get(fruits[l]) == 1) map.remove(fruits[l]);
                else map.put(fruits[l], map.get(fruits[l]) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
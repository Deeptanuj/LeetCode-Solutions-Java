class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> {
            int diffcomp = Integer.compare(b[0], a[0]);
            if(diffcomp != 0) return diffcomp; //just like b - a
            return Integer.compare(b[1], a[1]); //if diff is zero then real number gets compared
        });

        for(int n : arr){
            int diff = Math.abs(n - x);
            maxheap.offer(new int[]{diff, n});
            if(maxheap.size() > k) maxheap.poll();
        }

        List<Integer> ans = new ArrayList<Integer>();
        for(int[] pair : maxheap){
            ans.add(pair[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> a - b);
        for(int n : nums){
            minheap.offer(n);
            if(minheap.size() > k) minheap.poll();
        }
        return minheap.peek();
    }
}
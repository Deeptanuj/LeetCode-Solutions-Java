class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> a - b);
        for(int i : nums){
            minheap.offer(i);
            if(minheap.size() > k) minheap.poll();
        }
        return minheap.peek();
    }
}
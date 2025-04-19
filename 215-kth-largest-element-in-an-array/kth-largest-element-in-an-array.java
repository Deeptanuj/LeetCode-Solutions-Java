class Solution {
    public int findKthLargest(int[] nums, int k) {
        //MIN HEAP
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        for(int n : nums){
            minHeap.add(n);
            
            if(minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> a - b);
        for(int n : nums){
            minheap.add(n);
        }
        int i = 0;
        while(!minheap.isEmpty()){
            nums[i++] = minheap.poll();
        }
        return nums;
    }
}
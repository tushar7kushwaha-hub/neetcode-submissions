class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> container = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(container.containsKey(target-nums[i])){
                return new int[] {container.get(target-nums[i]), i};
            }else
            container.put(nums[i], i);
        }
        return new int[] {};
    }
}

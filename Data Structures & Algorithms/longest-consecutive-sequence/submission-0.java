class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxLen=0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curLen = 1;
                while(set.contains(i+1)){
                    curLen++;
                    i+=1;
                }
                maxLen=Math.max(maxLen, curLen);
            }
        }
        return maxLen;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int gmax=Integer.MIN_VALUE;
        int cmax=0;
        for(int i:nums){
            cmax=Math.max(i, cmax+i);
            gmax=Math.max(gmax,cmax);
        }
        return gmax;
    }
}

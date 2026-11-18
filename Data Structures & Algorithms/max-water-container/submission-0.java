class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(left<=right){
            int cur = 0;
            if(heights[left]<heights[right]){
                cur = heights[left]* (right-left);
                left++;
            }else{
                cur = heights[right]* (right-left);
                right--;
            }
            max=Math.max(max, cur);
        }
        return max;
    }
}

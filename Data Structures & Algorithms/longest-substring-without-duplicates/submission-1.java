class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int l = 0;
        int len = 0;
        for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);
            l=Math.max(l, arr[ch]);
            len = Math.max(len, r-l+1);
            arr[ch]=r+1;
        }
        return len;
    }
}

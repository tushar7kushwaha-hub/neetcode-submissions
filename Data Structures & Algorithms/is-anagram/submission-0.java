class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        for(int i=0;i<s.length();i++){
            sArr[s.charAt(i)-97]++;
            tArr[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(sArr[i]!=tArr[i]){
                return false;
            }
        }
        return true;
    }
}

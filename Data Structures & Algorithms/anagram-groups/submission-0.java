
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String> > map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s=String.valueOf(arr);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(str);
        } 
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> e : map.entrySet()){
            list.add(e.getValue());
        }
        return list;
    }
}

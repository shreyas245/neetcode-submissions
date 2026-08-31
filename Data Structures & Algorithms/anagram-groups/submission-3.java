class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if(!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());
            
            map.get(sortedString).add(s);
        }

        // List<String> temp = map.values();
        // for(String t: temp){
            // System.out.println(t);
        // }

        return new ArrayList<>(map.values());
    }
}

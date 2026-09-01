class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int res[] = new int[k];
        // Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], count + 1);
            } else {
                count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }

        }

        System.out.println(map);
    
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> map.get(b) - map.get(a));

        for(int i = 0; i < k; i++){
            res[i] = keys.get(i);
        }

        return res;
    }
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0;
        int res = Integer.MAX_VALUE;
        int change = 0;
        for (int j = 0; j < blocks.length(); j++) {
            char ch = blocks.charAt(j);

            if (ch == 'W') {
                change++;
            }
            if (j - i + 1 > k) {
                if (blocks.charAt(i) == 'W') {
                    change--;
                }
                i++;

            }

            if(j - i + 1 ==k){
                res = Math.min(res, change);
            }


        }
        return res;

    }
}
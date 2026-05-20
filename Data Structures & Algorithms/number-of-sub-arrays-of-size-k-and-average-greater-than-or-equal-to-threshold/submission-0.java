class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // Given integer of arr, k and threshold are numbers

        // if j - i + 1 == 3
        // maintain count of the window 
        // sum / 3

        int i = 0;
        int sum = 0;
        int result = 0;
        for (int j = 0; j < arr.length; j++) {

            if (i > arr.length)
                break;

            sum += arr[j];
            System.out.println(sum);

            if (j - i + 1 == k) {
                System.out.println("Window size = " + (j - i + 1));
                if ((sum / k) >= threshold) {
                    result++;
                    sum = sum - arr[i];
                    i++;
                } else {
                    sum = sum - arr[i];
                    i++;
                }

            }

        }
        return result;

    }
}
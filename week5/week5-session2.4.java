class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int currentMax = nums[0];
        int maxSum = nums[0];

        int currentMin = nums[0];
        int minSum = nums[0];

        total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            // Maximum subarray
            currentMax = Math.max(x, currentMax + x);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum subarray
            currentMin = Math.min(x, currentMin + x);
            minSum = Math.min(minSum, currentMin);

            total += x;
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular maximum
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}
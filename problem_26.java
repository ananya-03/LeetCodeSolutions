class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Two-pointer technique
        int k = 1; // Start from the second position since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place the unique element at index k
                k++;
            }
        }

        return k;
    }
}

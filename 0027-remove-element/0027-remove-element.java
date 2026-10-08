class Solution {
    public int removeElement(int[] nums, int val) {

        int C = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[C] = nums[i];
                C++;
            }
        }

        return C;
    }
}
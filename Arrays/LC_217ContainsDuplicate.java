//without using extraspace (without hashing)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isdup = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                isdup = true;
            }
        }
        return isdup;
    }
}

//when order doesn’t matter 
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // move last element here
                n--;                  // reduce size
            } else {
                i++;
            }
        }
        return n;
    }
}

//when order matters
//two-pointer approach
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}



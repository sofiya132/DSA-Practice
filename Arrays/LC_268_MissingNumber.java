//timecomplexity O(n) spacecomplexity O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int x : nums) sum -= x;
        return sum;
    }
}

//by using bit manipulation approach
//timecomplexity O(n) spacecomplexity O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i <= n; i++) xor ^= i;
        for (int x : nums) xor ^= x;

        return xor;
    }
}

//timecomplexity O(nlogn) spacecomplexity O(1)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // case: missing 0
        if (nums[0] != 0) return 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }
      
        // case: missing n
        return n;
    }
}

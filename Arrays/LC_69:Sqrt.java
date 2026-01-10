//to find squareroot of a number without using built in functions
class Solution {
    public int mySqrt(int x) {
        int l = 0, h = x, ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if ((long) mid * mid <= x) { //to avoid overflow
                ans = mid;        // possible answer
                l = mid + 1;   // try bigger
            } else {
                h = mid - 1;  // try smaller
            }
        }
        return ans;
    }
}



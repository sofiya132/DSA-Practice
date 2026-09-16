//TC (nlogn)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); //sort the array
        int mid =(0 +((nums.length)-1))/2;//after sorting the array middle element will be the majority element bcz since it occurs more than n/2 times therefore the majority elemeent one has to be present at the middle of the array also
        return nums[mid];
    }
}

/* try other approach:
Boyer–Moore Voting Algorithm — no sorting, no hashmap.
O(n) time, O(1) space
*/

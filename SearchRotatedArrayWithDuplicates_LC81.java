// LeetCode 81: Search in Rotated Sorted Array 
class Solution {
    public boolean search(int[] nums, int target) {
      int n = nums.length;
      int low = 0;
      int high = n-1; 
      while(low<=high) {
        int mid = (low+high)/2;
        if(nums[mid]==target){
            return true;
        }
          //  duplicates case
        if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }

        //check if left half is sorted
        else if(nums[low]<=nums[mid]){
            //if target is in left half
            if(target >= nums[low] && target <= nums[mid]){
                high = mid;
            }
            else{
                low = mid+1;
            }  
        }
        //right half is sorted
        else{
            //if target is in right half
            if(target >= nums[mid+1] && target <= nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
      
      }
        return false;
    }
}   

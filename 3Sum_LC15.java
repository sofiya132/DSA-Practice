//optimized O(N^2logN)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);//sort array
        List<List<Integer>>ans = new ArrayList<>();
        Set<List<Integer>>s = new HashSet<>();

    //fix one element and for the rest use two pointer approach
    for(int i=0;i<n-2;i++){
        int low = i+1;
        int high = n-1;

        while(low<=high){
            int sum = nums[i] + nums[low] +nums[high];
            if(sum==0 && i!=low && i!=high && low!=high){
                //store the triplets in set to avoid duplicates
                s.add(Arrays.asList(nums[i] , nums[low],nums[high]));
                low++;
                high--;
            }
            else if(sum<0){
                low++;
            }
            else{
                high--;
            }
        }
     }
     ans.addAll(s);
      return ans;
    }
}


//O(N3)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);//sort array
        List<List<Integer>>ans = new ArrayList<>();
        Set<List<Integer>>s = new HashSet<>();

    //fix one element and for the rest use two pointer approach
    for(int i=0;i<n-2;i++){
      for(int j=0;j<n-1;j++){
        for(int k =0;k<n;k++){
          if(nums[i]+nums[low]+nums[high] == 0){
             s.add(Arrays.asList(nums[i] , nums[low],nums[high]));
          }
        }
      }
    }
      ans.addAll(s);
      return ans;
    }
}
      
            


















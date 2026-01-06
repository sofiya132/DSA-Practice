class Solution {
    public boolean isPalindrome(int x) {
      //for negative numbers
        if(x<0){
            return false;
        }
        else{
            int temp =x;
            int rev = 0;
            while(x!=0){
             int d = x%10;
             x = x/10;
             rev= rev*10+d;
            }
            if(temp ==rev){
                return true;
            }
            else{ 
                return false;
            }
        }
    }
}

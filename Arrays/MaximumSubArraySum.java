import java.util.*;
class MaximumSubArraySum {
    public static int maxsubarrsum(int a[]) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int maxElement = a[0];
        for(int i=0;i<a.length;i++){
            cursum = cursum +a[i];
            //kadane's approach
            if(cursum<0){
                cursum = 0;
            }
             maxsum = Math.max(maxsum,cursum);
              maxElement = Math.max(maxElement,a[i]);
        }

      if(maxsum==0){//if all the elements of arrray are negative
          maxsum = maxElement;
      }
      return maxsum;  
    }
     
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= s.nextInt();
        }
        System.out.print(maxsubarrsum(a));
    }
}


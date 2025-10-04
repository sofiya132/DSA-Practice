import java.util.Scanner;

class Solution {
    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while(start < end) { 
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // First read the size of the array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        // Create array of that size
        int arr[] = new int[n];
        
        // Read n elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reverse the array
        reverseArray(arr);
        
        // Print reversed array
        System.out.println("Reversed array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
        
        sc.close();
    }
}
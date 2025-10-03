import java.util.Scanner;

class Solution {
    public static int largest(int arr[]) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE; // or throw an exception
        }
        int lar = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int maxElement = largest(arr);
        System.out.println("The largest element is: " + maxElement);
    }
}
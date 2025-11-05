 //TIME-COMPLEXITY 0(n2)
 import java.util.*;
 public class BubbleSort {
    public static void bubbleSort(int[] arr) {
 for(int turns=0;turns<arr.length-1;turns++){//i.e. turns=arr.length-2
             int swap = 0;
            for(int j=0;j<arr.length-1-turns;j++){//i.e. turns=arr.length-2-turns
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                    swap++;
                    
                }
            }
            if(swap ==0){
                break;
            }
        }
     }
     public static  void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        PrintArray(arr);
    }
}
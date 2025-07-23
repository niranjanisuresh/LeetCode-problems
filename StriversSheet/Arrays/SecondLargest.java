package StriversSheet.Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int SecondLargest(int[] arr, int n){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }else{
                max1=arr[1];
                max2=arr[0];
            }
            for(int i=2;i<n;i++){
                if(arr[i]>max1){   
                    max2 = max1;
                    max1=arr[i];
                }else if(arr[i]>max2){
                    max2=arr[i];

                }
            }
            return max2;       
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();     

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int result = SecondLargest(arr, n);
        System.out.println(result);
    }
}

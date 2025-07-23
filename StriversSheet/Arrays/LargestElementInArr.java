package StriversSheet.Arrays;

import java.util.Scanner;

public class LargestElementInArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int result = LargestElement(arr);
        System.out.println("Largest element in the array is: " + result);
    }
    public static int LargestElement(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

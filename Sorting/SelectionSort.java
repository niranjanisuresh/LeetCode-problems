package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = Scanner.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }       
    }
}

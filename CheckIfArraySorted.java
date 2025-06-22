import java.util.Scanner;

public class CheckIfArraySorted {
   public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
            return false;
           }
        }
        return true;
   }
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of elements: ");
       int n = scan.nextInt();

       int[] arr = new int[n];
       System.out.println("Enter the elements in the array: ");

       for (int i = 0; i < n; i++) {
           arr[i]=scan.nextInt();
       }

       if (isSorted(arr)){
        System.out.println("The array is sorted.");
       }
       else{
        System.out.println("The array is not sorted");
       }
   }
}

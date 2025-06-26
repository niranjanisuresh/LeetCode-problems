
import java.util.PriorityQueue;
import java.util.Scanner;

public class FifthMinimum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = scan.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();

        }
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        //insertion
        for(int i=0;i<n;i++){
            minHeap.offer(arr[i]);
        }
        //remove
        for(int i=1;i<5;i++){
            minHeap.poll();
        }
        //get the 5th 
        System.out.println("5th minimum element is: "+minHeap.peek());

    }
}


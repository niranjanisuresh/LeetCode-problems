/** 
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array is: ");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
}


import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        if(n<=0){
            System.out.println("Array must have atleast one element");
            return;
        }
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

       for(int i=0;i<n;i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }        
       }
       System.out.println("Maximum Element is: "+max);
       System.out.println("Minimum Element is: "+min);
    }
}
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = scanner.nextInt();

        int[][] adj = new int[vertices][vertices];

        System.out.println("Enter each edge as a pair of vertices (0-based index):");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;  
        }

        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
**/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr=new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
        }
        int product=1;
        for(int i=0;i<n;i++){
            
                product=product*arr[i];
            System.out.println(product);
        }
        
    }
}
<<<<<<< HEAD

import java.util.Arrays;

public class LeftRotataeTheArrayByOne {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        //THIS IS BASICALLY AN NAIVE APPROACH 
        //IM STORING THE TEMP VALUE 

        int temp = arr[0];

        //AND THEN IM TRAVERSING THROUGH THE ARRAY 
        for(int i = 1; i < arr.length ; i++){
            arr[i-1]=arr[i];
            //storing the value to the before variable
        }
        //basically we are giving the last one as 1
        arr[arr.length-1]=temp;
        //this is basically an method call
        System.out.println(Arrays.toString(arr));//this prints the values 
    }
}
=======

import java.util.Arrays;

public class LeftRotataeTheArrayByOne {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        //THIS IS BASICALLY AN NAIVE APPROACH 
        //IM STORING THE TEMP VALUE 

        int temp = arr[0];

        //AND THEN IM TRAVERSING THROUGH THE ARRAY 
        for(int i = 1; i < arr.length ; i++){
            arr[i-1]=arr[i];
            //storing the value to the before variable
        }
        //basically we are giving the last one as 1
        arr[arr.length-1]=temp;
        //this is basically an method call
        System.out.println(Arrays.toString(arr));//this prints the values 
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7

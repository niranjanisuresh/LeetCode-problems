public class nextpermutation {
    static void nextPermutation(int[] arr) {
        int pivot = -1;
        
        for(int i = arr.length - 2 ; i >= 0; i--){
            
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }
        
       for(int i = arr.length-1 ;i > pivot; i--){
           
           if(arr[i] > arr[pivot]){
               swap(arr, i, pivot);
               break;
           }
       }
       reverse(arr, pivot+1, arr.length-1);
    }  
       private static void reverse(int[] arr,int start, int end){
           while(start < end ){
               swap(arr, start++, end--);
           }
       }
       private static void swap(int[] arr, int i, int j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       public static void main(String[] args){
           int[] arr={2,4,1,7,5,0};
           nextPermutation(arr);
           
           for(int i = 0 ;i < arr.length; i++){
               System.out.print(arr[i]+" ");
           }
       }
    }



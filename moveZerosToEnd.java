<<<<<<< HEAD
class Solution {
    void pushZerosToEnd(int[] arr) {
       
        int insertPosition=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                insertPosition++;
            }
        }
        
        while(insertPosition<arr.length){
            arr[insertPosition++]=0;
        }
       
        
    }
    
=======
class Solution {
    void pushZerosToEnd(int[] arr) {
       
        int insertPosition=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                insertPosition++;
            }
        }
        
        while(insertPosition<arr.length){
            arr[insertPosition++]=0;
        }
       
        
    }
    
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
}
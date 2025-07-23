<<<<<<< HEAD
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
      int i=0;
      int j=arr.length-1;
      
      while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
    }
=======
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
      int i=0;
      int j=arr.length-1;
      
      while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
    }
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
}
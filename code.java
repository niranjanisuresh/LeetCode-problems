class Solution {
    public int getSecondLargest(int[] arr) {
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        if(arr[0]>arr[1]){
            
            max1=arr[0];
            max2=arr[1];
            
        }
        
        else {
            
            max1=arr[1];
            max2=arr[0];
            
        }
        
        for(int i=2;i<arr.length;i++){
            
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                
            }
            else if (arr[i]>max2){
                
                max2=arr[i];
            }
            }
            
        return max2;
    }
}
/**
 Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
 **/
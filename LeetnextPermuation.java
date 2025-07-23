<<<<<<< HEAD
public class LeetnextPermuation {
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length - 2 ; i >= 0 ;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums, pivot, i);
                break;
            }
        }
        reverse(nums, pivot+1, nums.length-1);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}

=======
public class LeetnextPermuation {
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length - 2 ; i >= 0 ;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums, pivot, i);
                break;
            }
        }
        reverse(nums, pivot+1, nums.length-1);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}

>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7

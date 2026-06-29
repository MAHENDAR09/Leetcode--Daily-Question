class Solution {
    public void nextPermutation(int[] nums) {

        int pointer = -1;
        int N  = nums.length;

        for (int i=N-2;i>=0;i--){

            if (nums[i] < nums[i+1]){
                pointer = i;
                break;
            }
        }
        
        if (pointer == -1){
            revArray(nums,0,N-1);
            return ;
        }


        for(int i=N-1;i>=0;i--){

            if (nums[i] > nums[pointer]){
                swap(nums,i,pointer);
                break;
            }
        }

        revArray(nums,pointer+1,N-1);
        return;
    }

    private static void revArray(int nums[],int s,int e){

        while (s < e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    private static void swap(int nums[],int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

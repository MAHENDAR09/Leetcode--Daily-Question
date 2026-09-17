class Solution {
    public int[] sortArray(int[] nums) {
        ms(nums,0,nums.length-1);
        return nums;
    }

    public void ms(int nums[],int low,int high){

        if (low >= high)
            return;
        
        int mid = (high - low) / 2 + low;

        ms(nums,low,mid);
        ms(nums,mid+1,high);

        merge(nums,low,mid,high);
    }

    public void merge(int nums[],int low,int mid,int high){

        int temp[] = new int[high - low + 1];

        int left = low;
        int right = 1 + mid;
        int idx = 0;


        while (left <= mid && right <= high){

            if (nums[left] < nums[right]){
                temp[idx] = nums[left];
                idx++;
                left++;
            }
            else {
                temp[idx] = nums[right];
                right++;
                idx++;
            }
        }

        while (left <= mid){
            temp[idx++] = nums[left++];
        }

        while (right <= high){
            temp[idx++] = nums[right++];
        }

        for (int i=0;i<temp.length;i++){
            nums[low+i] = temp[i];
        }
    }
}





class Solution {
    private static int ans = 0;
    public int reversePairs(int[] nums) {

        int n = nums.length;
        ans = 0;
        ms(nums,0,n-1);

        return ans;
    }

    private static int countPairs(int ar[],int low,int mid,int high){

        int cnt = 0;
        int right = mid+1;

        for (int i=low;i<=mid;i++){

            while(right <= high && ar[i] > (2L * ar[right])) 
                right++;

            cnt += (right - (mid+1));
        }
        return cnt;
    }
    private static void ms(int ar[],int low,int high){
        
        int mid = low + (high - low) / 2;
        
        if (low >= high)
            return;
        
        ms(ar,low,mid);
        ms(ar,mid+1,high);

        // LOGIC
        ans += countPairs(ar,low,mid,high);
        
        merge(ar,low,mid,high);
    }
    
    private static void merge(int ar[],int low,int mid,int high){
        
        
        int temp[] = new int[high - low + 1];
        
        int p1 = low;
        int p2 = mid + 1;
        int idx = 0;

        while (p1 <= mid && p2 <= high){
            
            if (ar[p1] <= ar[p2]){
                temp[idx] = ar[p1];
                idx++;
                p1++;
            }
            else{
            
                temp[idx] = ar[p2];
                idx++;
                p2++;
            }
        }
        
        
        while (p1 <= mid){
            temp[idx] = ar[p1];
            idx++;
            p1++;
        }
        
        while (p2 <= high){
            temp[idx] = ar[p2];
            idx++;
            p2++;
        }
        
        
        for (int i=0;i<temp.length;i++)
            ar[low+i] = temp[i];
            
    }
}

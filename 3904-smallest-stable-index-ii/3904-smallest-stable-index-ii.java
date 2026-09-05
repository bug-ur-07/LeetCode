class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int arr[] = new int[len];
        arr[len-1] = nums[len-1];

        for(int i=len-2;i>=0;i--){
            arr[i] = Math.min(arr[i+1] , nums[i]);
        }

        for(int i=0;i<len;i++){
            max = Math.max(nums[i] , max);

            if(max-arr[i] <= k){
                return i;
            }
        }

        return -1;
        
    }
}
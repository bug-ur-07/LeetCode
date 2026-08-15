class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        int l=0;
        int r=0;
        int sum =0;


        while(r<nums.length){
            sum+=nums[r];

            if(r-l+1 == k){
                max = Math.max(max , sum);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return (double) max/k;
    }
}
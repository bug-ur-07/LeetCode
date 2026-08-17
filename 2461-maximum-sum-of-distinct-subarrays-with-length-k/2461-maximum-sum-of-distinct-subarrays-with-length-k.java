class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        Map<Integer , Integer> map = new HashMap<>();
        long sum =0;
        long max =0;

        int r=0;
        int l=0;

        while(r<nums.length){
            int num = nums[r];
            map.put(num , map.getOrDefault(num , 0)+1);
            sum+=num;

            if(map.get(num)>1){
                while(map.get(num)!=1){
                    map.put(nums[l] , map.getOrDefault(nums[l]  , 0)-1);
                    if(map.get(nums[l])<=0){
                        map.remove(nums[l]);
                    }
                    sum-=nums[l];
                    l++;
                }
            }

            if(map.size()==k){
                max = Math.max(sum , max);
                map.remove(nums[l]);
                sum-=nums[l];
                l++;
            }

            r++;           
        }
        return max;
    }
}
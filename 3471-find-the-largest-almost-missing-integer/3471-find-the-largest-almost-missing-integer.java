class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int r=0;
        int l=0;
        int max =-1;

        int freq[] = new int[51];

        while(r<nums.length){
            Set<Integer> set = new HashSet<>();

            if(r-l+1 == k){

                for(int i=l;i<=r;i++){
                    set.add(nums[i]);
                }
                for(int e : set){
                    freq[e]++;
                }
                
                l++;
            }
            r++;
        }

        for(int i=0;i<nums.length;i++){

            if(freq[nums[i]]==1){
                max = Math.max(max , nums[i]);
            }
        }
        return max;
    }
}
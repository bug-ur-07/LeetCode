class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        
        List<Integer> list = new ArrayList<>();
        int count =0;

        int r=0;
        int l=0;
        int len = nums.length;
        int[] freq = new int[101];

        while(r<len){
            freq[nums[r] + 50]++;
            count++;

            if(count >=k){
                int cum = 0;

                for(int i=0;i<freq.length;i++){
                    cum+=freq[i];

                    if(cum>=x){
                        int val = i-50;
                        if(val <=0){
                            list.add(val);
                            
                        }else list.add(0);
                        break;
                    }
                }
                freq[nums[l] + 50]--;
                count--;
                l++;
            }
            r++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
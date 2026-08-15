class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

     return func(nums , k) - func(nums ,k-1);
    }

    public int func(int arr[] , int k){
        int count =0;
        int l =0;
        int r =0;
        int len = arr.length;
        Map<Integer ,Integer>map = new HashMap<>();

        while(r<len){
            map.put(arr[r]  , map.getOrDefault(arr[r] ,0)+1);

            if(map.get(arr[r])==1){
                k--;
            }

            while(k<0){
                map.put(arr[l]  , map.getOrDefault(arr[l],0) - 1);
                if(map.get(arr[l])==0){
                    k++;
                }
                l++;
            }
            
            count+= (r-l)+1;
            r++;
        }

        return count;
    }
}
class Solution {
    public int[] resultArray(int[] nums) {
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i=2;i<nums.length;i++){

            int l1E = l1.get(l1.size()-1); 
            int l2E = l2.get(l2.size()-1);
            if( l1E>=l2E){
              l1.add(nums[i]);  
            }else{

              l2.add(nums[i]);  
            }
        }

        int[] result = new int[nums.length];

        int index = 0;

        for (int num : l1) {
            result[index++] = num;
        }

        for (int num : l2) {
            result[index++] = num;
        }

        return result;

    }
}
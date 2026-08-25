class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int e : nums){
            set.add(e);
        }

        for(int i=1;i<=101;i++){
            if(!set.contains(i*k) && i!=0) return i*k;
        }

        return 0;
    }
}
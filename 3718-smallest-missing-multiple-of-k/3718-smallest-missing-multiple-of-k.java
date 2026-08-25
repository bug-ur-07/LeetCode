class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int e : nums){
            set.add(e);
        }

        for(int i=0;;i+=k){
            if(!set.contains(i) && i!=0) return i;
        }
    }
}
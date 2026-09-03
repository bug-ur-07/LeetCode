class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int smo = Integer.MAX_VALUE;


        for(int ele  : nums){
            if(ele%2!=0)smo = Math.min(smo , ele);
        }
        if(smo == Integer.MAX_VALUE) return true;
        for(int ele  : nums){
            
            if(ele%2==0 && ele <=smo) return false;
        }

        return true;
    }
}
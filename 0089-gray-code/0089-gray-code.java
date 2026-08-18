class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        
        int len = 1<<n;

        for(int i=0;i<len;i++){

            ans.add(i^(i>>1));
        }

return ans;
    }
}
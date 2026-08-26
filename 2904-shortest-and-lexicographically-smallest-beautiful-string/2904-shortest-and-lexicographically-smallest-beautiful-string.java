class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int i=0;
        int j=0;
        int len = s.length()-1;
        int sum =0;
        int minLen = Integer.MAX_VALUE;
        int minI = 0;
        int minJ = 0;
        String ans = s;


        for (char c : s.toCharArray()) {
            sum += c - '0';
            }
            if(sum ==0 || sum <k) return "";

            sum =0;
        while(j<=len){
            sum+=s.charAt(j) - '0';

            while(sum>k){
                sum-=s.charAt(i) - '0';
                i++;
            }
            while (sum == k && s.charAt(i) == '0') {
                if((j-i+1) < minLen ){
                    minLen = j-i+1;
                    minI = i;
                    minJ = j;
                }
                i++;
            }

            if (sum == k) {
                String t = s.substring(i, j + 1);
                if (
                    t.length() < ans.length() ||
                    (t.length() == ans.length() && t.compareTo(ans) < 0)
                ) {
                    ans = t;
                }
            }
            j++;
        }
        return ans;
    }
}
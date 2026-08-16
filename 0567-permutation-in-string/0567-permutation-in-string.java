class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        int r=0;
        int l=0;

        if(m>n) return false;
        
        for(char ch  : s1.toCharArray()){
            freq1[ch -'a']++;
        }


        while(r<n){
            char ch = s2.charAt(r);
            freq2[ch - 'a']++;

            if(r-l+1>m){
                freq2[s2.charAt(l) -'a']--;
                l++;
            }
            if(Arrays.equals(freq1 ,freq2))return true;
            r++;
        }

        return false;
    }
}
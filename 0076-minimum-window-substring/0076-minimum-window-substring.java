class Solution {
    public String minWindow(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        int min = Integer.MAX_VALUE;
        int freq[] = new int[256];

        int r=0;
        int l=0;
        int count=0;
        int indexL = -1;

        for(char ch : t.toCharArray()){
            freq[ch]++;
        }

        while(r<m){

            char ch = s.charAt(r);
            if(freq[ch] >0){
                count++;
            }
            freq[ch]--;

            while(count==n){
                if(r-l+1 < min){
                    min  = r-l+1;
                    indexL = l;
                }

                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0) count--;
                l++;
            }

            r++;
        }

        return indexL == -1 ? "" : s.substring(indexL ,indexL+min);
    }
}
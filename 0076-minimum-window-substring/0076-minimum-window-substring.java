class Solution {
    public String minWindow(String s, String t) {
        
        int freq[] = new int[256];

        for(char ch : t.toCharArray()){
            freq[ch]++;
        }

        int i=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        int indx = -1;
        int count = 0;

        while(i<s.length()){
            char ch = s.charAt(i);
            if(freq[ch]>0){
                count++;
            }
            freq[ch]--;

            while(count == t.length()){
                if(i-j+1<min){
                    min = i-j+1;
                    indx = j; 
                }

                freq[s.charAt(j)]++;
                if(freq[s.charAt(j)] > 0) count--;
                j++;
            }

            i++;
        }

        return indx == -1 ?  ""  : s.substring(indx , indx+min);
    }
}
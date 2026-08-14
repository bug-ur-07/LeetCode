class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character , Integer> map = new HashMap<>();
        int sum = 0;

        for(int i=0;i<s.length();i++){
            int min = s.length();
            char ch = s.charAt(i);
            map.put(ch , i);

            if(map.size()==3){
                for(Integer ele : map.values()){
                        min = Math.min(min , ele);
                    }
                sum+=min+1;
            }
        }

        return sum;
    }
}
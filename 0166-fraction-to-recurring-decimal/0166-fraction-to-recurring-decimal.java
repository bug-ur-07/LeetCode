class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder str = new StringBuilder();
        if(numerator == 0) return "0";
        if(numerator < 0 ^ denominator<0){
            str.append('-');
        }

        long div = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));

        str.append(div/divisor);
        long rem = div%divisor;
        if(rem == 0) return str.toString(); 
        str.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while(rem !=0){
            if(map.containsKey(rem)){
                str.insert(map.get(rem) , "(");
                str.append(")");
                return str.toString();
            }

            map.put(rem , str.length());
            rem *=10;
            str.append(rem/divisor);
            rem %= divisor;
        }

        return str.toString();
    }
}
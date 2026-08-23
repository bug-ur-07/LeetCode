class Solution {
    public boolean sumGame(String num) {
        char ch[]  = num.toCharArray();

        int ls = 0;
        int rs = 0;

        int lb = 0;
        int rb = 0;
        int s = 0;
        int e = ch.length-1;

        while(s<e){

      // Left side
            if (ch[s] == '?') {
                lb++;
            } else {
                ls += ch[s] - '0';
            }

            // Right side
            if (ch[e] == '?') {
                rb++;
            } else {
                rs += ch[e] - '0';
            }
            s++;
            e--;
        }

        if(lb+rb==0){            
            return ls-rs != 0 ;
        }
        if(rs+ls ==0){
            if(lb==rb)return false;
            return true;
        }
        if((lb+rb)%2 !=0)return true;
        int min = Math.min(lb , rb);
        lb -=min;
        rb -=min;
        if(lb>rb){
            if(ls>rs){
                return true;
            }else {
                if(9* (lb/2) == rs-ls) return false;
                else return true;
            }
        }else {
            if(rs>ls) return true;
            else {
                if(9 * (rb/2) == ls-rs) return false;
                else return true;
            }
        }
    }
}
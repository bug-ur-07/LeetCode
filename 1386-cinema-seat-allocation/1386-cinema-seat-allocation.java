class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        Map<Integer , Set<Integer>> map = new HashMap<>();

        for(int[] e : reservedSeats){
            int row = e[0];
            int col = e[1];

            if(!map.containsKey(row)){
                map.put(row , new HashSet<>());
            }
            map.get(row).add(col);
        }

        int ans = 2*n;

        for(int ele : map.keySet()){
            Set<Integer> set = map.get(ele);

            boolean l = !set.contains(2) && !set.contains(3) && !set.contains(4) && !set.contains(5);
            boolean m = !set.contains(4) && !set.contains(5) && !set.contains(6) && !set.contains(7);
            boolean r = !set.contains(6) && !set.contains(7) && !set.contains(8) && !set.contains(9);

            if(l && r) {}
            else if(l || m || r) ans -=1 ;
            else ans -=2 ;
        }

        return ans;
    }
}
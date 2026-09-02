class Solution {
    public boolean uniformArray(int[] nums1) {
        int e =0;
        int o = 0;
        int n = nums1.length;
        int arr[] = new int[n];

        for(int ele : nums1){
            if(ele%2==0)e++;
            else o++;
        }

        if(e == n || o == n) return true;

        int i=0;
        int j=1;

        while(i<n){
            if(j==n){
             arr[i] = nums1[i];
             break;   
            }
            arr[i] = Math.abs(nums1[i] - nums1[j]);
            i++;
            j++;
        }
        e =0;
        o=0;
        for(int l=0;l<n;l++){

            if(arr[i]==nums1[i]){
                e++ ;
                 o++;
            }else if(arr[i]%2==0) e++;
            else o++;
        }

        if(e == n || o == n) return true;
        return false;
    }
}
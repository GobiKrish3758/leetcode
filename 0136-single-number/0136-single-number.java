class Solution {
    public int singleNumber(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
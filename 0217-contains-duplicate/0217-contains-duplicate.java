class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]==a){
            count++;
           }
           else{
                a=nums[i];
           }
           if(count>=1){
            return true;
           }}
        return false;
    }
}

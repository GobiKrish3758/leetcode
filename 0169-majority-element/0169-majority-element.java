class Solution {
    public int majorityElement(int[] nums) {
       int max,count,maxcount=0,maxelement=0;
       if(nums.length==1){
        return nums[0];
       }
       for(int i=0;i<nums.length;i++){
        count=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            if(count>maxcount){
                maxcount=count;
                maxelement=nums[i];
            }
        }
       }   
       return maxelement;   
    }
}
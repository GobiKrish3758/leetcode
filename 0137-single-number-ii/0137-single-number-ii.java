
class Solution {
    public int singleNumber(int[] nums) {
           int s=0,count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                s=nums[i];
                break;
            }
            count=0;
        }
       return s;
        
    }
}
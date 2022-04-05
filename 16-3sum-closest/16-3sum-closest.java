class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int ans = 100000;
        int length = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<length-2;i=i+1){
            int left = i+1;
            int right = length-1;
            
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum==target){
                    return sum;
                }
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans = sum;
                }
                
                if(sum>target){
                    right --;
                }
                else{
                    left++;
                }
                
            }
            
        }
        
        return ans;
        
    }
}
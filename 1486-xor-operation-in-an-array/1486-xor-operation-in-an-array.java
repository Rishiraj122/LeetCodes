class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans=0;
        
        for(int i=0;i<n;i=i+1){
            
            arr[i] = start + 2*i;
            if(i==0){
                ans=arr[i];
            } else{
                ans=ans^arr[i];
            }
        }
        
        return ans;
        
    }
}
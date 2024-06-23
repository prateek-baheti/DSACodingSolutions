class Solution {

    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        k=k%nums.length;
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            arr[j++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++)
        {
            arr[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
















    }
    //    int n=nums.length;
    //    k=k%n;
    //    int j=0;
    //   int ans[]=new int[n];
    //     for(int i=n-k;i<n;i++)
    //    {
    //         ans[j++]=nums[i];
    //    }
       
       
    //    for(int i=0;i<n-k;i++)
    //    {
    //     ans[j++]=nums[i];
    //    }
    //    for(int i=0;i<ans.length;i++)
    //    {
    //     nums[i]=ans[i];
    //    }
    // }
    
}
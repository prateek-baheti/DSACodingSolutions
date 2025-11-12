// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum==k)
            {
                maxlength=i+1;
            }
            if(map.containsKey(sum-k))
            {
                int previosIndex=map.get(sum-k);
                maxlength=Math.max(maxlength,i-previosIndex);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return maxlength;
        
        
            }
}

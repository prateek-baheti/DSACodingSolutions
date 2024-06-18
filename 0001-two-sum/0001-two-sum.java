class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i)
            {
                return new int[]{i,map.get(complement)};
            }

        }
        return new int[]{};












        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],i);
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     int complement=target-nums[i];
        //     if(map.containsKey(complement) && map.get(complement)!=i)
        //     {
        //         return new int[]{i,map.get(complement)};
        //     }
        // }
        // return new int[]{};
















        // int a=0,b=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             a=i;
        //             b=j;
        //             break;
        //         }
        //     }
        // }
        // return new int[]{a,b};
        
    }
}
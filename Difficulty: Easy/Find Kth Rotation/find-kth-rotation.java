//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int left =0;
        int right=arr.size()-1;
        int min=Integer.MAX_VALUE;
        int ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr.get(left)<=arr.get(mid))
            {
                 min=Math.min(min,arr.get(left));
                    
                if(arr.get(left)<=min)
                {
                    ans=left;
                }
                left=mid+1;
               
            }else{
                 min=Math.min(min,arr.get(mid));
                    
                if(arr.get(mid)<=min)
                {
                    ans=mid;
                }
                right=mid-1;
            }
        }
        return ans;
        // Code here
    }
}
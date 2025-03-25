//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int max=-1;
        int min=-1;
        int[] nums=new int[2];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                min=Math.max(arr[i],min);
            }
            if(arr[i]>=x)
            {
                count++;
                if(count==1)
                {
                    max=Math.max(arr[i],max);
                }else{
                    max=Math.min(arr[i],max);
                }
                
            }
            
        }
        nums[0]=min;
        nums[1]=max;
        return nums;
        
    }
}

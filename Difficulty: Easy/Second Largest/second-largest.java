//{ Driver Code Starts
//Initial Template for Java
import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        int second_Largest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=max&&arr[i]>second_Largest)
            {
                second_Largest=arr[i];
            }
        }
        return second_Largest;

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>largest)
        //     {
        //         largest=arr[i];
        //     }
        // }
        // int second_Largest=-1;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>second_Largest && arr[i]!=largest)
        //     {
        //         second_Largest=arr[i];
        //     }
        // }
        // return second_Largest;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // code here
        // int largest=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>largest)
        //     {
        //         largest=arr[i];
        //     }
        // }
        // int secondLargest=-1;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>secondLargest && arr[i]!=largest )
        //     {
        //         secondLargest=arr[i];
        //     }
        // }
        
        // return secondLargest;
    }
}
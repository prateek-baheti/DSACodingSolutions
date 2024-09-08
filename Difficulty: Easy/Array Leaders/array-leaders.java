//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {

            // input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // inserting elements in the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            // calling leaders() function
            res = obj.leaders(n, arr);

            for (int i = 0; i < res.size(); i++) {
                ot.print(res.get(i) + " ");
            }

            ot.println();
        }
        ot.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> array=new ArrayList<Integer>();
        int max = arr[n-1];
        array.add(max);
        
        for(int i= n-2;i>=0;i--){
            if(arr[i]>=max){
                array.add(arr[i]);
                max=arr[i];
            }
            
        }
        Collections.sort(array,Collections.reverseOrder());
        // int count=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length-1;j++)
        //     {
        //         if(arr[i]<arr[j])
        //         {
        //             count=1;
        //         }
        //     }
        //     if(count==0)
        //     {
        //         array.add(arr[i]);
        //     }
        //     count=0;
        // }
        return array;
    }
}

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends

class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
       int low = 0, high = arr.length - 1;
        int floorIndex = -1;  // Default case if no element ≤ x

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids overflow

            if (arr[mid] <= x) {
                floorIndex = mid;  // Update floor index
                low = mid + 1;  // Move right to find last occurrence
            } else {
                high = mid - 1;  // Move left to find a smaller element
            }
        }

        return floorIndex;
    }
}



//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int x = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.findFloor(arr, x);

            System.out.print(ans);

            System.out.println(); // New line after printing the results
        }
    }
}

// } Driver Code Ends
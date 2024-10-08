//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
         
        return countSubstringsWithAtMostKDistinct(S, K) - countSubstringsWithAtMostKDistinct(S, K - 1);
        // your code here
    }
    private static int countSubstringsWithAtMostKDistinct(String s, int k) {
        int left = 0, right = 0, count = 0;
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);
            
            // If the window has more than k distinct characters, shrink it
            while (charFrequency.size() > k) {
                char leftChar = s.charAt(left);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                left++;
            }
            
            // Count all substrings ending at 'right'
            count += right - left + 1;
            right++;
        }
        
        return count;
    }
}
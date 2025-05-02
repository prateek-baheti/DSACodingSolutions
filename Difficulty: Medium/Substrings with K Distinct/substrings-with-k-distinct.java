//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(new Solution().countSubstr(s, k));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
        return countSubstringsWithKDistinct(s,k)-countSubstringsWithKDistinct(s,k-1);
        
    }
    public int countSubstringsWithKDistinct(String s,int k)
    {
        int left=0;
        int right=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length())
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k)
            {
                char ch=s.charAt(left);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                {
                    map.remove(ch);
                }
                left++;
                
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    
    
//     import java.util.HashSet;

// public class BruteForceSubstringCounter {

//     public int countSubstringsWithKDistinct(String s, int k) {
//         int n = s.length();
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             HashSet<Character> set = new HashSet<>();
//             for (int j = i; j < n; j++) {
//                 set.add(s.charAt(j));
//                 if (set.size() == k) {
//                     count++;
//                 } else if (set.size() > k) {
//                     break;  // no point continuing, we already exceeded k
//                 }
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         BruteForceSubstringCounter counter = new BruteForceSubstringCounter();
//         String s = "pqpqs";
//         int k = 2;
//         System.out.println(counter.countSubstringsWithKDistinct(s, k));  // Output: 7
//     }
//}

}


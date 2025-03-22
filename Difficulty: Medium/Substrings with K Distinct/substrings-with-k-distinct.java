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
        return countsubwith(s,k)-countsubwith(s,k-1);
        
    }
    private static int countsubwith(String s,int k)
    {
        int max=0;
        int count=0;
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length())
        {
            Character rightCharacter=s.charAt(right);
            map.put(rightCharacter,map.getOrDefault(rightCharacter,0)+1);
            while(map.size()>k)
            {
                Character ch=s.charAt(left);
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
}
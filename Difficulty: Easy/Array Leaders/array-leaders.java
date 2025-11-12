class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> arra=new ArrayList<>();
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                arra.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.sort(arra,Collections.reverseOrder());
        return arra;
    }
}

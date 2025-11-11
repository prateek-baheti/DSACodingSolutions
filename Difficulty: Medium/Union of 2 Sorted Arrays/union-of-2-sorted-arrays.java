class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> distinctElement=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            distinctElement.add(a[i]);
        }
         for(int i=0;i<b.length;i++)
        {
            distinctElement.add(b[i]);
        }
        
        for(Integer x:distinctElement)
        {
            arr.add(x);
        }
        Collections.sort(arr);
        return arr;
    }
}

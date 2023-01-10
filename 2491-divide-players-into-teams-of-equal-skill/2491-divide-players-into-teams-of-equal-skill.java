class Solution {
    public long dividePlayers(int[] a)
    {
        int n=a.length;
        if(n == 2)
            return a[0] * a[1];
        int i;
        Arrays.sort(a);
        int v=a[0] + a[n-1];
        long ans=0;
        for(i=0;i<n/2;i++)
        {
            if(a[i] + a[n-1-i] == v)
                ans=ans + (a[i] * a[n-1-i]);
            else
                return -1;
        }
        return ans;
    }
}
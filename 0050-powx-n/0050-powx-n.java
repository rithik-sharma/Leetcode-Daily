class Solution {
    public double myPow(double x, int n) {
		long nm = n;
		if(n<0){
		   nm = -nm;
		   x = 1/x;
		  }
        return power(x,nm);
    }
    
    public double power(double x, long n)
    {
        if(n==0)
            return 1;
			
        if(n%2==0){
            return power(x*x, n/2);
        }
        else{
            return x * power(x,n-1);
        }
    }
}
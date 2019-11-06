
long long solve(int A[], int n)
{
	if(n==1)
	{
	    return 0;
	}
	if(n==2)
	{
	    if(A[0]>A[1])
	    {
	        return 1;
	    }
	    else
	    {
	        return 0;
	    }
	}
	else
	{
	    int i,c=0;
	    for(i=0;i<=n-1;i++)
	    {
	        if(A[n-1]<A[i])
	        {
	            c++;
	        }
	    }
	    int ans=solve(A,n-1);
	    return ans+c;
	}
}

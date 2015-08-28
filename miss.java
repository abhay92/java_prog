class miss
{
public static void main(String alpha[])
{
    int ar[]={0,1,2,3,4,5,6,7,8,9},n=13983,i,j,x=0,r,arr[]={1,2,3,2,2,1,2};
	while(n>0)
	{
	r=n%10;
	n=n/10;
	arr[x]=r;
	x++;
	}
	
	for(i=0;i<=9;i++)
	{
	for(j=0;j<=x-1;j++)
	{
	if(ar[i]==arr[j])
	break;
	
	}
	if(j==x)
	System.out.printf(""+ar[i]);
	
	}
}
}

//hi abhinav

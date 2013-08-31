class star
{
public static void main(String ar[])
{
    int n=13439634,i,j,x=0,r,arr[]={1,2,3,2,2,1,2,6,8,4};
	while(n>0)
	{
	r=n%10;
	n=n/10;
	arr[x]=r;
	x++;
	}
for(i=x-1;i>=0;i--)
{

for(j=0;j<arr[i];j++)
{
System.out.print("*");
}
System.out.println("");
}



}
}

class fibo_p
{
 public static void main(String arr[])
{
int i,a,m=0,n=1;
System.out.println("1");
while(m<200)
{
m=m+n;

for(i=2;i<m;i++)
{
a=m%i;
if(a==0)
break;
}
if(i==m)
System.out.println(""+m);


n=n+m;
if(n>200)
break;
for(i=2;i<n;i++)
{
a=n%i;
if(a==0)
break;
}
if(i==n)
System.out.println(""+n);

}


}
}

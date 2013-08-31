class fibo
{
 public static void main(String arr[])
{
int i=0,j,a=1,b;
for(j=1;j<200;j++)
{
i=i+a;
System.out.println("  "+i);
a=a+i;
if(a>200)
break;
System.out.println("  "+a);


}


}
}

class rev
{
public static void main(String arr[])
{
int a=3338987,r,rev=0;
System.out.println("The number is "+a);

while(a>0)
{
r=a%10;
a=a/10;
rev=rev*10+r;
}
System.out.println("Ans:"+rev);
}
}

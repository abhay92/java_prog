class pat_r
{
public static void main(String arr[])
{
int i,j,k;
for(i=1;i<=8;i++)
 {
for(j=1;j<=8-i;j++)
 {if(j==1)
 {
 for(k=1;k<=i-1;k++)
System.out.print(" ");
 }
System.out.print("* ");
 }
System.out.print("\n");
 }
}
}

class pat
{
public static void main(String arr[])
{
int i,j,k;
for(i=1;i<=8;i++)
 {
for(j=1;j<=i;j++)
 {if(j==1)
 {
 for(k=1;k<=8-i;k++)
System.out.print(" ");
 }
System.out.print("* ");
}
System.out.print("\n");
 }
}
}

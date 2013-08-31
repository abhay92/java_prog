class prime
{
 public static void main(String arr[])
{
int i,a,b;
for(a=3;a<200;a++)
{




for(i=2;i<a;i++)
{
//if(a==1&&a==2)
//System.out.println("Not a prime number");

b=a%i;

if(b==0)


//System.out.println("not a prime number");
break;






}

if(i==a)
System.out.println(""+i);


}


}
}

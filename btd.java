class Btd
{
static int binarytodecimal(int x[])
{
int i,j,sum=0;
for(j=0,i=x.length-1;i>=0;i--,j++)
{
sum=sum+(x[i]*pow(2,j));
}
return sum;
}
static int pow(int a,int b)
{
int power=1;
for(int i=1;i<=b;i++)
{
power=power*a;
}
return power;
}
public static void main(String[] s)
{
int x[]={1,0,0,0,1,1};
int num=0;
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print(" ");
}
num=binarytodecimal(x);
System.out.println("");
System.out.println("The decimal equivalent is \t");
System.out.print(num);
}
}

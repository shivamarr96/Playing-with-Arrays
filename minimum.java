class Minimum
{
static int min(int x[])
{
int i,min=x[0];
for(i=0;i<x.length;i++)
{
if(x[i]<min)
{
min=x[i];
}
}
return min;
}
public static void main(String[] s)
{
int x[]={-10,-20,30,40,-329};
int num;
num=min(x);
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("\n the min value is");
System.out.println(num);
}
}

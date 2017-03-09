class Maximum
{
static int max(int x[])
{
int i,max=x[0];
for(i=0;i<x.length;i++)
{
if(x[i]>max)
{
max=x[i];
}
}
return max;
}
public static void main(String[] s)
{
int x[]={-10,-20,-30,-40};
int num;
num=max(x);
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println(" \n the max value is");
System.out.println(num);
}
}

class Mean
{
static float findmean(int x[])
{
float m;
int sum=0;
for(int i=0;i<x.length;i++)
{
sum+=x[i];
}
m=(float)sum/x.length;
return m;
}
public static void main(String[] s)
{
int x[]={98,97,96,99,95,94};
float num;
num=findmean(x);
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("");
System.out.println(" \n the mean value is");
System.out.println(num);
}
}

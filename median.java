class Median
{
static void sort(int x[])
{
int i,j,temp;
for(i=0;i<x.length-1;i++)
{
for(j=i+1;j<x.length;j++)
{
if(x[i]>x[j])
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
}
static float findmedian(int x[])
{
float med;
if(x.length%2==0)
{
med=(x[(x.length/2)-1]+x[x.length/2])/2;
}
else
{
med=x[x.length/2];
}
return med;
}
public static void main(String[] s)
{
int x[]={10,20,30,40,56,67,1,9,-3};
float num;
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
sort(x);
System.out.println("");
System.out.println("the sorted array is");
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
num=findmedian(x);
System.out.println("");
System.out.println("the Median is \t");
System.out.print(num);
}
}
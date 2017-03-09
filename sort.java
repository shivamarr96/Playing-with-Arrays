class Sort
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
public static void main(String[] s)
{
int x[]={-10,-200,3650,-5640};
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
}
}

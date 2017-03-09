class Sort1
{
static void sort1(int x[][])
{
int i,j,k=0,temp;
int y[];
int len=0;
for(i=0;i<x.length;i++)
{
len+=x[i].length;
}
y=new int[len];
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++,k++)
{
y[k]=x[i][j];
}
}
for(i=0;i<y.length-1;i++)
{
for(j=i+1;j<y.length;j++)
{
if(y[i]>y[j])
{
temp=y[i];
y[i]=y[j];
y[j]=temp;
}
}
}
k=0;
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++,k++)
{
x[i][j]=y[k];
}
}
}
public static void main(String[] s)
{
int x[][]={{-10,-200},{3650,-5640}};
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
sort1(x);
System.out.println("");
System.out.println("the sorted array is");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
}
}

class Shift
{
static void shift(int x[])
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
int count=0;
for(i=0;i<x.length;i++)
{
if(x[i]<0)
{count++;}
}
for(i=0;i<count-1;i++)
{
for(j=i+1;j<count;j++)
{
if(x[i]<x[j])
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
int x[]={-200,3650,-5640,5670,-1000,-5,78,-6};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
shift(x);
System.out.println("");
System.out.println("the array after shift operation is");
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
}
}

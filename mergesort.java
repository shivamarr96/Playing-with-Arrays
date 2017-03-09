class Mergesort
{
static void Mergesort(int x[])
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
int i;
int x[]={-10,-200,3650,-5640};
int y[]={20,300,3630,9640};
for(i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("");
for(i=0;i<y.length;i++)
{
System.out.print(y[i]);
System.out.print("\t");
}
int z[];
z=new int[x.length+y.length];
for(i=0;i<x.length;i++)
{
z[i]=x[i];
}
for(int j=0;j<y.length;j++,i++)
{
z[i]=y[j];
}
Mergesort(z);
System.out.println("");
System.out.println("the sorted array is");
for(i=0;i<z.length;i++)
{
System.out.print(z[i]);
System.out.print("\t");
}
}
}

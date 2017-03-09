class Freqcount
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
static void frequencycount(int x[])
{
int i,j;
int count[];
count=new int[x.length];
for(i=0;i<x.length;i++)
{
for(j=0;j<x.length;j++)
{
if(x[j]==x[i])
{
count[i]++;
}
}
}
System.out.println("");
System.out.print("Element");
System.out.print("\t");
System.out.print("Frequency");
for(i=0;i<x.length;i+=count[i])
{
System.out.println("");
System.out.print(x[i]);
System.out.print("\t");
System.out.print(count[i]);
}
} 
public static void main(String[] s)
{
int x[]={10,20,20,20,20,40,40,65,50};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
sort(x);
frequencycount(x);
}
}

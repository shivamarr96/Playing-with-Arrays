class Intersection
{
static void intersection(int x[],int y[])
{
int z[];
int i,j,flag1=0;;
int count[],count1[];
count=new int[x.length];
count1=new int[y.length];
for(i=0;i<count.length;i++)
{
count[i]++;
}
for(i=0;i<count1.length;i++)
{
count1[i]++;
}
for(i=0;i<x.length;i++)
{
for(j=0;j<y.length;j++)
{
if(y[j]==x[i])
{
count[i]++;
count1[j]++;
flag1++;
}
}
}
z=new int[flag1]; 
for(j=0,i=0;i<x.length;i++)
{ 
if(count[i]>1)
{
z[j]=x[i];
j++;
}
}
System.out.println("");
System.out.println("the intersection is");
for(i=0;i<z.length;i++)
{
System.out.print(z[i]);
System.out.print("\t");
}
}
public static void main(String[] s)
{
int i;
int x[]={-10,-200,3650,-5640};
int y[]={20,300,3650,-5640};
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
intersection(x,y);
}
}

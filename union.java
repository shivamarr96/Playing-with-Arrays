class Union
{
static void union(int x[],int y[])
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
z=new int[x.length+y.length-flag1]; 
int temp=0;
for(i=0;i<x.length;i++)
{
z[i]=x[i];
temp++;
}
for(i=0;i<y.length;i++)
{
if(count1[i]==1)
{
z[temp]=y[i];
temp++;
}
}
System.out.println("");
System.out.println("the union is");
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
int y[]={3650,20,300,3650,-5640};
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
union(x,y);
}
}

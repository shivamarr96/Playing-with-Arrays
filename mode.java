class Mode
{
static int findmode(int x[])
{
int i,j,t=0,flag=0;
int count[];
count=new int[x.length];
int mode=x[0];
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
int max=count[0],flag1=0;
for(i=0;i<count.length;i++)
{
if(count[i]>max)
{
max=count[i];
flag1=i;
}
}
return x[flag1];
} 
public static void main(String[] s)
{
int x[]={10,20,20,20,20,40,50};
int num;
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
num=findmode(x);
System.out.println("");
System.out.println("the Mode is \t");
System.out.print(num);
}
}

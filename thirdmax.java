class Thirdmax
{
static int thirdmax(int x[])
{
int i,temp=0,pos=0,max=x[0];
for(i=0;i<x.length;i++)
{
if(x[i]>max)
{
max=x[i];
pos=i;
}
}
temp=x[pos];
x[pos]=x[x.length-1];
x[x.length-1]=temp;
max=x[0];
for(i=0;i<x.length-1;i++)
{
if(x[i]>max)
{
max=x[i];
pos=i;
}
}
temp=x[pos];
x[pos]=x[x.length-1];
x[x.length-1]=temp;
max=x[0];
for(i=0;i<x.length-2;i++)
{
if(x[i]>max)
{
max=x[i];
}
}
return max;
}
public static void main(String[] s)
{
int x[]={23,43,234,350,-10,-20,-30,-40,100,200,345,456,567};
int num;
num=thirdmax(x);
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println(" \n the third greatest value is");
System.out.println(num);
}
}

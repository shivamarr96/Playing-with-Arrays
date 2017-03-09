class Hclquestion
{
static int hcl(int x[])
{
int i,k,temp,flag=0,ch=1,pol=0;
do{

pol=0;
temp=maximum(x);
if(x[temp]%2==0)
{
flag++;
for(i=0;i<x.length;i++)
{
if(x[i]%2==0)
{x[i]=x[i]/2;}
else
{x[i]--;
flag++;
x[i]=x[i]/2;}
}
}
else
{
flag++;
x[temp]--;
}
for(k=0;k<x.length;k++)
{
if(x[k]==0)
pol++;
}
if(pol==x.length)ch=-1;
}while(ch==1);
return flag; 
}
static int maximum(int x[])
{
int j,max=x[0],pos1=0;
for(j=0;j<x.length;j++)
{
if(x[j]>max)
{
max=x[j];
pos1=j;
}
}
return pos1;
}
public static void main(String[] s)
{
int x[]={123,234,345,456,567,789};
int num;
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
num=hcl(x);
System.out.println(" \n number of operations is");
System.out.println(num);
}
}

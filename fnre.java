class Fnre
{
static void firstnon_repeating(int x[])
{
int i,j,temp=0,flag=-1;
for(i=0;i<x.length-1;i++)
{
for(j=i+1;j<x.length;j++)
{
if(x[i]==x[j])
{
break;
}
if(j==(x.length-1)&&x[x.length-1]!=x[j])
{
flag=1;
temp=i;
}
}
if(flag==1)
{
break;
}
}
if(flag==1)
{
System.out.println("First non repeating element in array is \t");
System.out.print(x[temp]);
}
else
{
System.out.println("No non repeating element");
}
}
public static void main(String[] s)
{
int x[]={1,2,3,4,1,2,3,4};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("");
firstnon_repeating(x);
}
}

class Maxin1
{
static void maxinonerow(int x[][])
{
int i,j;
int count[];
count=new int[x.length];
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
if(x[i][j]==1)
{
count[i]++;
}
}
}
int max=count[0],temp=0;
for(i=0;i<count.length;i++)
{
if(count[i]>max)
{
max=count[i];
temp=i;
}
}
for(i=0;i<x[temp].length;i++)
{
System.out.print(" ");
System.out.print(x[temp][i]);
}
System.out.println("");
System.out.println("Maximum in one row \t");
System.out.print(max);
}
public static void main(String[] s)
{
int x[][]={{1,1,1,1,1,1,1,1,1},{0,1,1,1,1,0},{1,0}};
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
maxinonerow(x);
}
}

class Maximum1
{
static int max1(int x[][])
{
int i,max=x[0][0];
for(i=0;i<x.length;i++)
{
for(int k=0;k<x[i].length;k++)
{
if(x[i][k]>max)
{
max=x[i][k];
}
}
}
return max;
}
public static void main(String[] s)
{
int x[][]={{-10,-20,-30},{-40,60},{34,4555}};
int num;
num=max1(x);
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
System.out.println("the max value is");
System.out.println(num);
}
}

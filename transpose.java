class Transpose
{
static void matrixtranspose(int x[][])
{
int i,j;
int y[][];
y=new int[x[0].length][x.length];
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
y[j][i]=x[i][j];
}
}
for(i=0;i<y.length;i++)
{
for(j=0;j<y[i].length;j++)
{
System.out.print(y[i][j]);
System.out.print("\t");
}
System.out.println("");
}
}
public static void main(String[] s)
{
int x[][]={{-10,-20},{-40,60},{34,4555}};
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
System.out.println("");
System.out.println("Matrix after transpose");
matrixtranspose(x);
}
}

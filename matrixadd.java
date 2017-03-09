class Matrixadd
{
static void matrixadd(int x[][],int y[][])
{
int z[][];
z=new int[x.length][];
for(int i=0;i<x.length;i++)
{
z[i]=new int[x[i].length];
}
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
z[i][j]=x[i][j]+y[i][j];
}
}
System.out.println("");
for(int i=0;i<z.length;i++)
{
for(int j=0;j<z[i].length;j++)
{
System.out.print(z[i][j]);
System.out.print("\t");
}
System.out.println("");
}
}
public static void main(String[] s)
{
int x[][]={{-10,-20},{-40},{34,455,898}};
int y[][]={{1,1},{1},{1,1,1}};
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
for(int i=0;i<y.length;i++)
{
for(int j=0;j<y[i].length;j++)
{
System.out.print(y[i][j]);
System.out.print("\t");
}
System.out.println("");
}
System.out.println("sum matrix");
matrixadd(x,y);
}
}

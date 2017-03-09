class Matrixmult
{
static void matrixmult(int x[][],int y[][])
{
int z[][];
z=new int[x.length][y[0].length];
for(int i=0; i<x.length;i++)
for(int j=0; j<y[0].length;j++)
for(int k=0; k<x[0].length;k++)
    {
        z[i][j]+=x[i][k]*y[k][j];
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
int x[][]={{-10,-20,20},{-40,34,45},{34,455,898}};
int y[][]={{1,0,0},{0,1,0},{0,0,1}};
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
System.out.println("");
for(int i=0;i<y.length;i++)
{
for(int j=0;j<y[i].length;j++)
{
System.out.print(y[i][j]);
System.out.print("\t");
}
System.out.println("");
}
if(x[0].length==y.length)
{
System.out.println("matrix after multiplication");
matrixmult(x,y);
}
else
{
System.out.println("\t not possible");
}
}
}

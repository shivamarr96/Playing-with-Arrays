class B_triangle
{
static void Bmax(int x[][])
{
int i,j;
int max=x[0][0];
for(i=0;i<x.length;i++)
{
for(j=0;j<=i;j++)
{
if(x[i][j]>max)
{
max=x[i][j];
}
}
}
System.out.print(max);
}
static void Bmin(int x[][])
{
int i,j;
int min=x[0][0];
for(i=0;i<x.length;i++)
{
for(j=0;j<=i;j++)
{
if(x[i][j]<min)
{
min=x[i][j];
}
}
}
System.out.print(min);
}
static void Bsum(int x[][])
{
int i,j;
int sum=0;
for(i=0;i<x.length;i++)
{
for(j=0;j<=i;j++)
{
sum+=x[i][j];
}
}
System.out.print(sum);
}
public static void main(String[] s)
{
int x[][]={{1,2,3},{4,5,6},{7,8,9}};
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
System.out.println("Bmax of triangle \t");
Bmax(x);
System.out.println("");
System.out.println("Bsum of triangle \t");
Bsum(x);
System.out.println("");
System.out.println("Bmin of triangle \t");
Bmin(x);
}
}

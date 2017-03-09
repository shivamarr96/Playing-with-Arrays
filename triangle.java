class Triangle
{
static void printtriangle(int x[])
{
int i,j;
for(i=0;i<x.length;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(x[j]);
System.out.print("\t");
}
System.out.println("");
}
}
public static void main(String[] s)
{
int x[]={-10,-20,-30,-40};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("\n The triangle sequence is");
System.out.println("");
printtriangle(x);
}
}

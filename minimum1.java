class Minimum1
{
static int min1(int x[][])
{
int i,min=x[0][0];
for(i=0;i<x.length;i++)
{
for(int k=0;k<x[i].length;k++)
{
if(x[i][k]<min)
{
min=x[i][k];
}
}
}
return min;
}
public static void main(String[] s)
{
int x[][]={{10,20},{30,40},{329,2,455}};
int num;
num=min1(x);
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("\t");
}
System.out.println("");
}
System.out.println("the min value is");
System.out.println(num);
}
}

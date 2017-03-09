class Matrixsum
{
static void matsum(int x[][])
{
int i,j,sum=0,sum1=0,sum2=0,sum3=0;
for(i=0;i<x.length;i++)
{
sum=0;
for(j=0;j<x[i].length;j++)
{
System.out.print("\t");
System.out.print(x[i][j]);
if(i==j)
sum2+=x[i][j];
if(i+j==x.length-1)
sum3+=x[i][j];

sum+=x[i][j];
}
System.out.print("\t");
System.out.print(sum);
System.out.println("");
}
System.out.println("");
System.out.print(sum3);
for(i=0;i<x[0].length;i++)
{
sum1=0;
for(j=0;j<x.length;j++)
{
sum1+=x[j][i];
}

System.out.print("\t");
System.out.print(sum1);
}
System.out.print("\t");
System.out.print(sum2);
}
public static void main(String[] s)
{
int x[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
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
matsum(x);
}
}

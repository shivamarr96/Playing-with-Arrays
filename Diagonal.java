class Diagonal
{
static void printdiagonal(int x[][])
{
int sum=0;
for(sum=0;sum<=(x.length+x[0].length-2);sum++)
{
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
if((i+j)==sum)
{System.out.print(x[i][j]);
System.out.print(" ");}
}
}
System.out.println("");
}
}
static void seqdiagonal(int x[][])
{
int sum=0,flag=0;
for(sum=0;sum<=(x.length+x[0].length-2);sum++)
{
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
if((i+j==sum)&&flag==1)
{System.out.print(x[i][j]);
System.out.print(" ");}
if((i+j==sum)&&flag==0)
{System.out.print(x[j][i]);
System.out.print(" ");}
}
}
if(flag==1)
flag=0;
else
flag=1;
}
}
public static void main(String[] s)
{
int x[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
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
System.out.println("Matrix printed diagonalwise");
printdiagonal(x);
System.out.println("");
System.out.println("Matrix sequence diagonalwise");
seqdiagonal(x);
}
}

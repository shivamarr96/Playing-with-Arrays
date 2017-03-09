class Ntw
{
static void numtoword(int x[])
{
int i,j;
System.out.println("");
System.out.println("The word equivalent is \t");
if(x.length==1)
{
switch (x[0])
{
case 1:System.out.println("one");
break;
case 2:System.out.println("two");
break;
case 3:System.out.println("three");
break;
case 4:System.out.println("four");
break;
case 5:System.out.println("five");
break;
case 6:System.out.println("six");
break;
case 7:System.out.println("seven");
break;
case 8:System.out.println("eight");
break;
case 9:System.out.println("nine");
break;
case 0:System.out.println("zero");
break;
}
}
else if(x.length==2)
{
if(x[0]==1)
{
switch (x[1])
{
case 1:System.out.println("eleven");
break;
case 2:System.out.println("twelve");
break;
case 3:System.out.println("thirteen");
break;
case 4:System.out.println("fourteen");
break;
case 5:System.out.println("fifteen");
break;
case 6:System.out.println("sixteen");
break;
case 7:System.out.println("seventeen");
break;
case 8:System.out.println("eighteen");
break;
case 9:System.out.println("nineteen");
break;
case 0:System.out.println("ten");
break;
}
}
else{
switch (x[0])
{
case 2:System.out.print("twenty");
break;
case 3:System.out.print("thirty");
break;
case 4:System.out.print("forty");
break;
case 5:System.out.print("fifty");
break;
case 6:System.out.print("sixty");
break;
case 7:System.out.print("seventy");
break;
case 8:System.out.print("eighty");
break;
case 9:System.out.print("ninety");
break;
}
switch (x[1])
{
case 1:System.out.print(" one");
break;
case 2:System.out.print(" two");
break;
case 3:System.out.print(" three");
break;
case 4:System.out.print(" four");
break;
case 5:System.out.print(" five");
break;
case 6:System.out.print(" six");
break;
case 7:System.out.print(" seven");
break;
case 8:System.out.print(" eight");
break;
case 9:System.out.print(" nine");
break;
}
}
}
else
{
if(x.length==6)
{
switch (x[0])
{
case 1:System.out.print(" one");
break;
case 2:System.out.print(" two");
break;
case 3:System.out.print(" three");
break;
case 4:System.out.print(" four");
break;
case 5:System.out.print(" five");
break;
case 6:System.out.print(" six");
break;
case 7:System.out.print(" seven");
break;
case 8:System.out.print(" eight");
break;
case 9:System.out.print(" nine");
break;
}
System.out.print(" lakh ");
}

if(x.length>=5)
{
if(x[x.length-5]==1)
{
switch (x[x.length-4])
{
case 1:System.out.println("eleven");
break;
case 2:System.out.println("twelve");
break;
case 3:System.out.println("thirteen");
break;
case 4:System.out.println("fourteen");
break;
case 5:System.out.println("fifteen");
break;
case 6:System.out.println("sixteen");
break;
case 7:System.out.println("seventeen");
break;
case 8:System.out.println("eighteen");
break;
case 9:System.out.println("nineteen");
break;
case 0:System.out.println("ten");
break;
}
}
else{
switch (x[x.length-5])
{
case 2:System.out.print("twenty");
break;
case 3:System.out.print("thirty");
break;
case 4:System.out.print("forty");
break;
case 5:System.out.print("fifty");
break;
case 6:System.out.print("sixty");
break;
case 7:System.out.print("seventy");
break;
case 8:System.out.print("eighty");
break;
case 9:System.out.print("ninety");
break;
}
}
if(x[1]==1)
System.out.print(" thousand ");
}
if(x.length>4&&x[1]!=1||x.length==4)
{
switch(x[x.length-4])
{
case 1:System.out.print(" one");
System.out.print(" thousand ");
break;
case 2:System.out.print(" two");
System.out.print(" thousand ");
break;
case 3:System.out.print(" three");
System.out.print(" thousand ");
break;
case 4:System.out.print(" four");
System.out.print(" thousand ");
break;
case 5:System.out.print(" five");
System.out.print(" thousand ");
break;
case 6:System.out.print(" six");
System.out.print(" thousand ");
break;
case 7:System.out.print(" seven");
System.out.print(" thousand ");
break;
case 8:System.out.print(" eight");
System.out.print(" thousand ");
break;
case 9:System.out.print(" nine");
System.out.print(" thousand ");
break;
}
}
if(x.length>=3)
{
switch(x[x.length-3])
{
case 1:System.out.print(" one");
System.out.print(" hundred ");
break;
case 2:System.out.print(" two");System.out.print(" hundred ");
break;
case 3:System.out.print(" three");System.out.print(" hundred ");
break;
case 4:System.out.print(" four");System.out.print(" hundred ");
break;
case 5:System.out.print(" five");System.out.print(" hundred ");
break;
case 6:System.out.print(" six");System.out.print(" hundred ");
break;
case 7:System.out.print(" seven");System.out.print(" hundred ");
break;
case 8:System.out.print(" eight");System.out.print(" hundred ");
break;
case 9:System.out.print(" nine");System.out.print(" hundred ");
break;
}
if(x[x.length-2]==1)
{
switch (x[x.length-1])
{
case 1:System.out.println("eleven");
break;
case 2:System.out.println("twelve");
break;
case 3:System.out.println("thirteen");
break;
case 4:System.out.println("fourteen");
break;
case 5:System.out.println("fifteen");
break;
case 6:System.out.println("sixteen");
break;
case 7:System.out.println("seventeen");
break;
case 8:System.out.println("eighteen");
break;
case 9:System.out.println("nineteen");
break;
}
}
else{
switch (x[x.length-2])
{
case 2:System.out.print("twenty");
break;
case 3:System.out.print("thirty");
break;
case 4:System.out.print("forty");
break;
case 5:System.out.print("fifty");
break;
case 6:System.out.print("sixty");
break;
case 7:System.out.print("seventy");
break;
case 8:System.out.print("eighty");
break;
case 9:System.out.print("ninety");
break;
}
switch (x[x.length-1])
{
case 1:System.out.print(" one");
break;
case 2:System.out.print(" two");
break;
case 3:System.out.print(" three");
break;
case 4:System.out.print(" four");
break;
case 5:System.out.print(" five");
break;
case 6:System.out.print(" six");
break;
case 7:System.out.print(" seven");
break;
case 8:System.out.print(" eight");
break;
case 9:System.out.print(" nine");
break;
}
}
}
}





}
public static void main(String[] s)
{
int x[]={1,0,7,0,9,8};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("");
}
numtoword(x);
}
}

//VIVEKANANDA ADEPU
// A code to find the local peaks of the given 2-Dimensional array
import java.util.*;
import java.io.*;

public class LocalPeaks
{
public static void main(String[] args) throws IOException
{
Scanner keyboard = new Scanner(System.in);
String filename = args[0];//input is taken here

File file1 = new File(filename);
Scanner inputFile = new Scanner(file1);

int count,i=0,n,m,k,j=0;
String[][] arr = new String[10000][10000];
int[][] a = new int[10000][10000];
int[] b = new int[10000];
String[] c=new String[10000];

while (inputFile.hasNext())
{
String line = inputFile.nextLine(); 

line=line.replace('[',' '); //removes the square braces
line=line.replace(']',' '); 
line = line.trim();//removes white spaces

j=0;
for (String retval: line.split(","))
{

arr[i][j]=retval;
arr[i][j] = arr[i][j].trim();
a[i][j]=Integer.parseInt(arr[i][j]);// converts string to integer
j++;
}
i++;
}

System.out.println("Array Size:"+i+"x"+j);
m=i;
n=j;

int x=0,y=0;

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)//finding local peaks
{

if(	((i>=1)&&(i<m))	&&	((j>=1)&&(j<n))	)
{
if(	(a[i][j]>=a[i][j-1])	&&	(a[i][j]>=a[i][j+1])	&&	(a[i][j]>=a[i-1][j])	&&	(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}

}

else if(	(i==0)	&&	((j>=0)&&(j<=n))	)
{
if((i==0)&&(j==0))
{
if(	(a[i][j]>=a[i][j+1])	&&	(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
else if((i==0)&&(j==n))
{
if(	(a[i][j]>=a[i][j-1])	&&	(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
else
{
if(	(a[i][j]>=a[i][j-1])	&&	(a[i][j]>=a[i][j+1])

	&&(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
}

else if( ((i<m)&&(i>=1))	&&	((j==0)||(j==n))	)
{
if(j==0)
{
if(	(a[i][j]>=a[i-1][j])	&&	(a[i][j]>=a[i][j+1])

	&&(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
else if(j==n)
{
if(	(a[i][j]>=a[i-1][j])	&&	(a[i][j]>=a[i][j-1])

	&&(a[i][j]>=a[i+1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
}



else if(	(i==m)	&&	((j>=0)&&(j<=n))	)
{
if(j==0)
{
if(	(a[i][j]>=a[i][j+1])	&&	(a[i][j]>=a[i-1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
else if(j==n)
{
if(	(a[i][j]>=a[i][j-1])	&&	(a[i][j]>=a[i-1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;
}
}
else
{
if(	(a[i][j]>=a[i][j-1])	&&	(a[i][j]>=a[i][j+1])

	&&(a[i][j]>=a[i-1][j])	)
{
b[x]=a[i][j];x++;
b[x]=i+1;x++;
b[x]=j+1;x++;

}
}
}


}
} 



m=x;




try 
{
File file = new File("output.txt");
if (!file.exists()) 
{
file.createNewFile();//creating new file if file doesnot exits in the current directory
}
FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);//creates an object that is used to write to a file
	
for(x=0;x<m;x++)
{
System.out.println(b[x]);
c[x]=Integer.toString(b[x]);
bw.write(c[x]);//writes values to the output file
bw.write(" is a local peak at position:");
x++;
c[x]=Integer.toString(b[x]);
bw.write("("+c[x]+",");
x++;
c[x]=Integer.toString(b[x]);//converts integer to string
bw.write(c[x]+")");
String newLine = System.getProperty("line.separator");
bw.write(newLine);
}

bw.close();// closing buffered writer
System.out.println("Output file created");
} 
catch (IOException e) 
{
e.printStackTrace();
}
inputFile.close();// closing the input file
}
}
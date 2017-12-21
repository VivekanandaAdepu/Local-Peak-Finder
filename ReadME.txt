

*************************************Contents Of the folder*****************************************************************

1.ReadME.txt
2.input.txt
3.LocalPeaks.java
4.LocalPeaks.class
5.output.txt



*************************************Local peak finding Algorithm in a 2D array*********************************************

In a 2D array of size mxn where there are 'm' number of rows and 'n' number of columns, if we consider an array 'a'.consider the element a[i][j] which has to be greater than or equal to its neighbours ie., a[i][j]>=a[i-1][j];a[i][j]>=a[i+1][j];a[i][j]>=a[i][j-1];a[i][j]>=a[i][j+1]. Then we call a[i][j] as local peak of the 2D array. we identify the local peak by implementing the following code.



*************************************LocalPeaks.java************************************************************************

In the code we call the utility and input-output packages in java. The utility package is used to use the methods like buffered reader and buffered writer which are used to read and write
to a given file. We first read an input file which contains the 2D representation of an array of size mxn. Then we use trim and split funtions accordingly, to eliminate the commas and square brackets and retrieve only the numbers and store them in a string array which are then converted into integer values using parseInt function. Now, we analyze the array of elements for the local peaks and then store them in an array. Finally, using buffered reader and writers accordingly, we write the values of the local peaks to the output file. Before writing the values we convert the values again to string format,as only characters and strings can be written into a text file.



*************************************Minimum Software Requirements:

compiler: java 4.0 and above
Architecture: MAC-OS, Windows NT and above, Linux and its flavours(java is however architecture independent)
RAM:512Mb and above.
Storage:512Mb and above.
Processor: i3 and above.



*************************************Compiling Steps************************************************************************

If you are reding this you have extracted my compressed file. Now, open command prompt and go to the older/directory where the java file named 'LocalPeaks.java' using the change directory command and then compile the code using "javac LocalPeaks.java" after succesfully compiling the java code run the code by passing the command line argument as 'input.txt' by using "java LocalPeaks input.txt". Now, the output.txt file is created and output containing the local peaks with their positions in the array are written into the output file.

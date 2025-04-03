import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
public class f3{
public static void main(String[]args){
try{
FileWriter f1=new FileWriter("new2.txt");
BufferedWriter b1= new BufferedWriter(f1);
b1.write("File Handling Problem 2");
b1.newLine();
b1.write("     Completed!!");
b1.close();}
catch(Exception error){
System.out.println("Error is: "+error);
}
}}
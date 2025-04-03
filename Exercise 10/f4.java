import java.io.FileReader;
import java.io.FileNotFoundException;
public class f4{
public static void main(String[]args){
try{
FileReader f1=new FileReader("Mera.txt");
BufferedReader b1=new BufferedReader(f1);
String c=b1.readLine();
while (c!=null){
System.out.print(c);
c=b1.read();
}
b1.close();
}
catch(Exception e){
System.out.println("Error found");
}
}
}
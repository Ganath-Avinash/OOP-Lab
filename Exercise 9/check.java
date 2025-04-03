import java.util.Scanner; 
class Divide{ 
void div(int a){ 
try{ 
int ff=100/a; 
System.out.println("Answer is: "+ff); 
} 
catch(Exception e){ 
System.out.println("Can't divide by Zero"); 
}}} 
public class check{ 
public static void main(String[]args){ 
Divide d1=new Divide(); 
Scanner ip = new Scanner(System.in); 
System.out.println("Enter Number to divide by 100: "); 
try{ 
int num=ip.nextInt(); 
d1.div(num); 
} 
catch(Exception e){ 
System.out.println("Enter only number!!"); 
} 
finally{ 
System.out.println("Completed!"); 
}}} 
 
import java.util.Scanner; 
public class Eh { 
    public void divide(int a, int b) throws ArithmeticException { 
        int result= a / b; 
    } 
 
    public static void main(String[] args) { 
        try { 
   Scanner ip=new Scanner(System.in); 
   int a=ip.nextInt(); 
   int b=ip.nextInt(); 
   EH2 e1= new EH2(); 
   e1.divide(a,b); 
          System.out.println("Result: " + a/b); 
        }  
 catch (ArithmeticException e) { 
          System.out.println("Error: Division by zero is not allowed."); 
        } 
    } 
}
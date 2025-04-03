import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
class Agev {
    void checkAge(int a) {
        try {
            if (a < 0 || a > 150) {
                throw new InvalidAgeException("Age is Invalid");
            }System.out.println("Age Ok!!");
        } 
	catch (InvalidAgeException e) {
            System.out.println(e);
        }
	
    }
}
public class CE1 {
    public static void main(String[] args) {
        Agev a1 = new Agev();
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int a = ip.nextInt();        
        a1.checkAge(a);         
        ip.close(); 
    }
}

import java.util.Scanner;
public class even{
    public void find(int a){
        if(a>=0){
            if (a%2==0){
                System.out.println("It is even!");
            }
            else{
                System.out.println("It is odd!");
            }}
        else{
            System.out.println("Enter a number greater than or equalt to 0!!");
        }
    }
    public static void main(String[]args){
        Scanner ip = new Scanner(System.in);
        even ob1=new even();
        System.out.print("Enter no to check: ");
        int a=ip.nextInt();
        ob1.find(a);
    }
}
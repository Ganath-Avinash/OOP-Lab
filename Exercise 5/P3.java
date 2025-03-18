public class P3{
public static void main(String[]args){
Calculator c1=new Calculator();
c1.add(1,2);
c1.add(1,2,3);
c1.mul(23,23);
c1.mul(2,3,2);
c1.sub(9,2);
c1.sub(8,4,5);
c1.div(3,4);
c1.div(3,4,3);
}
}

class Calculator{
void add(int a,int b){
System.out.println("Sum is: "+(a+b));
}
void add(int a,int b,int c){
System.out.println("Sum is: "+(a+b+c));
}
void mul(int a,int b){
System.out.println("Product is: "+(a*b));
}
void mul(int a,int b,int c){
System.out.println("Product is: "+(a*b*c));
}
void sub(int a,int b){
System.out.println("Left of: "+(a-b));
}
void sub(int a,int b,int c){
System.out.println("Left of: "+(a-b-c));
}
void div(double a,double b){
System.out.println("Product is: "+(a/b));
}
void div(double a,double b,double c){
System.out.println("Product is: "+((a/b)/c));
}
}



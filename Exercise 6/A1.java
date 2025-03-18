public class A1{
public static void main(String[]args){
Add a1=new Add();
Sub s1=new Sub();
Mul m1=new Mul();
Div d1=new Div();
a1.add(2,3);
s1.sub(3,4);
m1.mul(8,7);
d1.div(6,6);
}
}

abstract class Calculator{
abstract void add(int a,int b);
abstract void mul(int a,int b);
abstract void sub(int a,int b);
abstract void div(int a,int b);
}

class Add extends Calculator{
void add(int a,int b){
System.out.println("Sum is: "+(a+b));
}
void sub(int a,int b){}
void mul(int a,int b){}
void div(int a,int b){}
}

class Sub extends Calculator{
void add(int a,int b){}
void sub(int a,int b){
System.out.println("Subtracted value is: "+(a+b));
}
void mul(int a,int b){}
void div(int a,int b){}
}

class Mul extends Calculator{
void add(int a,int b){}
void sub(int a,int b){}
void mul(int a,int b){
System.out.println("Product is: "+(a+b));
}
void div(int a,int b){}
}

class Div extends Calculator{
void add(int a,int b){}
void sub(int a,int b){}
void mul(int a,int b){}
void div(int a,int b){
System.out.println("Divided answer is: "+(a+b));
}
}


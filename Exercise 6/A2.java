public class A2{
public static void main(String[]args){
Circle c1=new Circle(3);
c1.calc();
Rect r1=new Rect(3,4);
r1.calc();
Square s1=new Square(2);
s1.calc();
}
}

abstract class Shape{
abstract void calc();
void dis(){
System.out.println("Its a shape");
}
}

class Circle extends Shape{
int a;
Circle(int a){
this.a=a;
}
void calc(){
System.out.println("Area is: "+(3.14*a));
}
}

class Square extends Shape{
int a;
Square(int a){
this.a=a;
}
void calc(){
System.out.println("Area is: "+(a*a));
}
}

class Rect extends Shape{
int a;
int b;
Rect(int a,int b){
this.a=a;
this.b=b;
}
void calc(){
System.out.println("Area is: "+(b*a));
}
}




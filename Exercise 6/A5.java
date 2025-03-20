public class A5{
public static void main(String[]args){
circle c1=new circle(9);
rect r1=new rect(8,9);
c1.area();
c1.per();
r1.area();
r1.per();
}
}

interface shape{
void area();
void per();
}

class circle implements shape{
int a;
circle(int a){
this.a=a;
}
public void area(){
System.out.println("Area is: "+(a*a));
}
public void per(){
System.out.println("Perimeter is: "+(2*3.14*a));
}
}

class rect implements shape{
int a;int b;
rect(int a,int b){
this.a=a;
this.b=b;
}
public void area(){
System.out.println("Area is: "+(a*b));
}
public void per(){
System.out.println("Perimeter is: "+(2*(a+b)));
}
}


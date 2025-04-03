public class P1{
public static void main(String[]args){
eagle e1=new eagle("Eagle");
pen p1=new pen("Penguin");
e1.dis();
e1.fly();
p1.dis();
p1.fly();
}
}

class Bird{
String type;
void fly(){
System.out.println("Birds fly in various speeds");
}
void dis(){
System.out.println("It is "+type);
}
}
class eagle extends Bird{
eagle(String typ){
super.type=typ;
}
void fly(){
System.out.println("Eagle flies fastly and has keen eyes");
}
}
class pen extends Bird{
pen(String typ){
super.type=typ;
}
void fly(){
System.out.println("Penguins Can't fly");
}
}


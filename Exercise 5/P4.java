
public class P4{
public static void main(String[]args){
Greet g1=new Greet();
g1.g();
g1.g("Ganath");
g1.g("Ganath",18);
}
}

class Greet{
void g(){
System.out.println("Hello");
}
void g(String a){
System.out.println("Hello "+a);
}
void g(String a,int b){
System.out.print("Hello "+a);
System.out.println(" And Your age is "+b);
}
}


public class A3{
public static void main(String[]args){
part p1=new part("Person1",1);
full f1=new full("Person2",2);
p1.dis();
p1.cs();
f1.dis();
f1.cs();
}
}

abstract class Emp{
abstract void cs();
int id;
String Name;
Emp(String Name,int id){
this.Name=Name;
this.id=id;
}
void dis(){
System.out.println("Name: "+Name);
System.out.println("id: "+id);
}
}

class part extends Emp{
part(String nam,int id){
super(nam,id);
}
void cs(){
System.out.println("Salary is(per hr): 50$");
}
}

class full extends Emp{
full(String nam,int id){
super(nam,id);
}
void cs(){
System.out.println("Salary is(per day): 200$");
}
}

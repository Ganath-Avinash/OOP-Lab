public class E1{
public static void main(String[]args){
Person p1=new Person();
p1.set("Ganath",18);
p1.disp();
}
}

class Person{
private String name;
private int age;
void set(String a,int b){
name=a;
age=b;
}
void disp(){
System.out.println("Person name is: "+name+" and age is: "+age);
}
}



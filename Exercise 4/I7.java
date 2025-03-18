public class I7{
public static void main(String[]args){
cstudent c1=new cstudent("Ganath",18,"CollegeStudent");
teacher t1=new teacher("Malar",37,"Teacher");
student s1=new student("Boy",16,"Student");
c1.dis();
c1.learn();
t1.dis();
t1.teach();
s1.dis();
s1.learn();
}
}

class Person{
String name;
int age;
Person(String name,int age){
this.name=name;
this.age=age;
}
void dis(){
System.out.println("Name and age is: "+name+" "+age);
}
}
class teacher extends Person{
String role;
teacher(String name,int age,String role){
super(name,age);
this.role=role;
}
void teach(){
System.out.println("Their role: "+role);
System.out.println("Teacher teaches");
}
}
class student extends Person{
String role;
student(String name,int age,String role){
super(name,age);
this.role=role;
}
void learn(){
System.out.println("Their role: "+role);
System.out.println("Student Learns");
}
}
class cstudent extends student{
cstudent(String name,int age,String role){
super(name,age,role);
}
}
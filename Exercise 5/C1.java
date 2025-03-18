public class C1{
public static void main (String[]args){
emp e1=new emp(123,"Gojo Satoru",27);
e1.di();
e1.emdi();
}
}

class Person{
int age;
String name;
Person(String name,int age){
this.name=name;
this.age=age;
}
void di(){
System.out.println("Name is: "+name);
System.out.println("Age is: "+age);
}
}

class emp extends Person{
int emid;
int yrss;
emp(int emid,String name,int age){
super(name,age);
this.emid=emid;
}
void emdi(){
System.out.println("Employee id is: "+emid);
}
}
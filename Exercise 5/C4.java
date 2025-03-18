public class C4{
public static void main (String[]args){
emp e1=new emp(123,"Gojo Satoru",27);
emp e2=new emp(123,"Sukuna",27,6);
e1.di();
e1.emdi();
e2.di();
e2.emdi1();
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
emp(int emid,String name,int age,int yrss){
    super(name,age);
    this.emid=emid;
    this.yrss=yrss;
    }
void emdi(){
System.out.println("Employee id is: "+emid);
}
void emdi1(){
    System.out.println("Employee id is: "+emid);
    System.out.println("Years Of Experience is: "+yrss);
    }
}
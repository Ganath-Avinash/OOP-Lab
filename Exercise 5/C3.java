public class C3{
public static void main(String[]args){
Book b1=new Book(1987,"Book Of Love");
Book b2=new Book(1990,"Carol","Lorane");
b1.dis();
b2.dis1();
}
}

class Book{
int yr;
String title;
String Author;
Book(int yr,String title){
this.title=title;
this.yr=yr;
}
Book(int yr,String title,String Author){
this.title=title;
this.yr=yr;
this.Author=Author;
}
void dis(){
System.out.println("The details are:: Book Title: "+title+" :: Release Year: "+yr);
}
void dis1(){
System.out.println("The details are:: Book Title: "+title+" :: Release Year: "+yr +" :: Author : "+Author);
}
}
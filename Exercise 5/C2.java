public class C2{
public static void main(String[]args){
Book b1=new Book(1987,"Book Of Love");
b1.dis();
}
}

class Book{
int yr;
String title;
Book(int yr,String title){
this.title=title;
this.yr=yr;
}
void dis(){
System.out.println("The details are:: Book Title: "+title+" :: Release Year: "+yr);
}
}


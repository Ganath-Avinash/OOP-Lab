public class A6{
public static void main(String[]args){
duck d1=new duck();
d1.swim();
d1.fly();
}
}

interface swims{										
void swim();
}

interface flyable{
void fly();
}

class duck implements swims,flyable{
public void swim(){
System.out.println("Duck can swim");
}
public void fly(){
System.out.println("Duck can fly");
}
}


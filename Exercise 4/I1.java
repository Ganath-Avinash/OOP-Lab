public class I1{
    public static void main(String[]args){
    Car c1=new BMW();
    BMW b1=new BMW();
    Car c2=new Car();
    c1.stt();
    b1.stt();
    b1.drive();
    }
    }
    
    class Car{
    void stt(){
    System.out.println("Car Starts");
    }
    }
    class BMW extends Car{
    void drive(){
    System.out.println("BMW Is Driven");
    }
    }
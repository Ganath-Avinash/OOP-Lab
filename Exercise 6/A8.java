
public class A8{
public static void main(String[]args) {
Dog dog = new Dog();
dog.eat();
dog.sleep();
dog.makeSound();
}
}

interface Animal {
void eat();
void sleep();
default void makeSound() {
System.out.println("Animal sound");
}
}

class Dog implements Animal {
public void eat() {
System.out.println("Dog is eating.");
}
public void sleep() {
System.out.println("Dog is sleeping.");
}
public void makeSound() {
System.out.println("Bark");
}
}

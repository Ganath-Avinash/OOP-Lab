
public class E8 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Emily");
        person.setLastName("Clark");
        person.setAge(30);
        System.out.println("Person Age: " + person.getAge());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Age must be between 1 and 120.");
        }
    }

    public int getAge() {
        return age;
    }
}



//question4
public class Question4 {

//   (i) what is the difference between a class and an object in java.
//   A Class is a blueprint of an object while an object is an instance of a class.


    public static void main(String[] args) {
//        initializing object of class person
        Person person = new Person(25,800000);

//        getting the age and salary of the object of class person.

        System.out.println("initial age:" + person.getAge());
        System.out.println(" initial salary:" + person.getSalary());

//        setting the age and salary of the object of class Person.
        person.setAge(20);
        person.setSalary(1500000);

//        printing the new details of person.
        System.out.println("New age :" + person.getAge());
        System.out.println("New salary:" + person.getSalary());


//        INITIALIZING OBJECT OF CLASS BOX.
        Box box = new Box(20);

//        printing the initial width of object box.
        System.out.println("initial width:" + box.getWidth());

//        updating the width of object box using setter method.
        box.setWidth(30);

//        printing the updated width.
        System.out.println("updated width is :" + box.getWidth());

    }

}
//    (ii) java program to store the age ,salary of a person.

//class person.
class Person{
//    attributes of class person.
    private int age;
    private double salary;

//constructor to initialise objects of class person.
    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

//(iii) java program to create a class Box and its instance.

//class Box.

class Box{
    private double width;

//    constructor to initialise object of class Box.
    public Box(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
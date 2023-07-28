import java.util.List;

public class Question2{

//question 2

//(i) Define  private modifier, public access modifier and a protected modifier.

// A private modifier is a keyword used to hide an attribute or method of a class from other classes
// out of the block scope.

// A public access modifier is a keyword used to give access of an attribute or method outside a class
// or the block scope.

    // A protected modifier is a keyword used when preventing attributes or methods to be accessed without
// authorisation.


    public class question2 {
//    creating an instance of class Restaurant
    }

//    (ii)program to create class restaurant.
    class Restaurant{

        //    attributes of class restaurant.
        private List<String> items;
        private Double prices;
        private String ratings;


        public Restaurant(List<String> items, double prices, String ratings) {
            this.items = items;
            this.prices = prices;
            this.ratings = ratings;
        }
        // getters and setters
        public double getPrices() {
            return prices;
        }

        public void setPrices(double prices) {
            this.prices = prices;
        }

        //    method to add items
        public void addItems( String item){
            items.add(item);
        }

        //    method to remove items.
        public void removeItems( String item){
            items.remove(item);
        }


    }
//question2
//    (iii)
//    creating class student.
    class Student{

//        attributes of class student.
       private String name;
       private int grade;
       private  List<String>courses;


    public Student(String name, int grade, List<String> courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }
//getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

//    method to add courses
    public void addCourse(String course){
        courses.add(course);

    }

//    method to remove courses
    public void removeCourse(String course){
        courses.remove(course);
    }
}
}

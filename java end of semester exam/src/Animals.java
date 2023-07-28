

//question 1
//(iv) java program that stores an Arraylist of animals and prints all the animals in
//collection.

import java.util.ArrayList;
import java.util.List;


public class Animals {
    public static void main(String[] args) {

//        an arraylist of animals.
        List<String> Animals = new ArrayList<>();

//        adding animal elements in a collection of animals.
        Animals.add("lion");
        Animals.add("leopard");
        Animals.add("zebra");
        Animals.add("giraffe");

//        printing the animals in the collection .
        System.out.println(Animals);
    }

}

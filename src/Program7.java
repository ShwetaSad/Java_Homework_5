import java.util.ArrayList;

public class Program7 {
    //Write a Java program to test if an array list is empty or not.

    public static void fruits(){

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Bananas");
        fruits.add("Pears");
        fruits.add("Grapes");
        fruits.add("Strawberries");
// checking if arraylist is empty or not
        System.out.println(fruits.isEmpty());

        //removing all elements from the list
        fruits.removeAll(fruits);
        // checking again if arraylist is empty or not
        System.out.println(fruits.isEmpty());


    }

    public static void main(String[] args) {
        fruits();
    }
}

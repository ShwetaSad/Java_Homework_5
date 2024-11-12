import java.util.ArrayList;

public class Program4 {

//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.

    public static void main(String[] args) {
        rainbow();
    }
        public static void rainbow() {
            ArrayList<String> colours = new ArrayList<>();
            colours.add("Red");
            colours.add("Blue");
            colours.add("Yellow");
            colours.add("Green");
            colours.add("Pink");


            for (Object colour : colours) {
                System.out.println(colour);
            }
        }
    }

import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {

    // Write a Java program to iterate through all elements in an array list using Iterator.
    public static void iterator() {


        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.add("Blue");
        rainbow.add("Red");
        rainbow.add("yellow");
        rainbow.add("Green");
        rainbow.add("Pink");


        Iterator<String> list = rainbow.iterator();
        while (list.hasNext()) {
            System.out.print(list.next() + ",");
        }
    }

    public static void main(String[] args) {
        iterator();
    }
}
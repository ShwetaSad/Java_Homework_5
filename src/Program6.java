import java.util.ArrayList;

public class Program6 {
   // Write a Java program to retrieve an element (at a specified index) from a given
    //array list

    public static void colours(){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Pink");

        System.out.println(colours.get(4));
        System.out.println(colours.get(2));
        System.out.println(colours.get(1));
    }

    public static void main(String[] args) {
        colours();
    }

}

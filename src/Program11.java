import java.util.ArrayList;

public class Program11 {
    /*
    Declare following two arrylist and compare it.

ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
     */
    public static void arraylist() {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare c1 and c2 to find common elements
        ArrayList<String> commonElements = new ArrayList<String>(c1);
        commonElements.retainAll(c2);
        System.out.println("Common elements between c1 and c2: " + commonElements);

        // Compare c1 and c2 to find differences (elements in c1 but not in c2)
        ArrayList<String> differentElements = new ArrayList<String>(c1);
        differentElements.removeAll(c2);
        System.out.println("Elements in c1 but not in c2: " + differentElements);

        // Check if the two lists are equal
        boolean areEqual = c1.equals(c2);
        System.out.println("Are the two lists equal? " + areEqual);


    }

    public static void main(String[] args) {
        arraylist();
    }
}

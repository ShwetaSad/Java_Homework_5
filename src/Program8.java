import java.util.HashSet;

public class Program8 {
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */

public static void collections(){


    HashSet<Integer> Objects = new HashSet<>();
Objects.add(4);
Objects.add(7);
Objects.add(8);

    System.out.println("Checking which numbers between 1 and 10 are in the set:");

    for(int i =1; i <=10;i++){
        if(Objects.contains(i)) {
            System.out.println(i + " is in the set");
        }else {
            System.out.println(i+ " is not in the set");
        }
    }

}

    public static void main(String[] args) {
        collections();
    }}
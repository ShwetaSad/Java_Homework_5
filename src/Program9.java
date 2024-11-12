import java.util.HashMap;
import java.util.Map;

public class Program9 {

    //Create a HashMap object called people that will store String keys and Integer
    //values: And use for each loop to iterate the value from Map.

    public void people(){

        Map<String,Integer> people = new HashMap<>();
        people.put("Shweta", 1);
        people.put("Kareena",2);
        people.put("Pooja", 3);
        people.put("Payal", 4);
        people.put("Neha",5);

        System.out.println(people);
        for (Map.Entry<String,Integer> People : people.entrySet()){
            System.out.println(People.getKey()+ " "+People.getValue());

        }

    }

    public static void main(String[] args) {
        Program9 p = new Program9();
        p.people();
    }

}

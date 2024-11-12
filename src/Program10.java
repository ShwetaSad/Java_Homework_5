import java.util.*;

public class Program10 {
   /* Write a programme that tells you which line passes through particular stations.
    Just use Zone 1 stations name.

    */
   public static void main(String[] args) {
london();

   }
       public static void london(){
       // Initialize a HashMap where each station name maps to a list of lines that pass through it
       Map<String, List<String>> stationLinesMap = new HashMap<>();

       // Adding some Zone 1 stations and their corresponding lines
       stationLinesMap.put("Baker Street", Arrays.asList("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
       stationLinesMap.put("Oxford Circus", Arrays.asList("Bakerloo", "Central", "Victoria"));
       stationLinesMap.put("Piccadilly Circus", Arrays.asList("Bakerloo", "Piccadilly"));
       stationLinesMap.put("King's Cross St. Pancras", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"));
       stationLinesMap.put("Liverpool Street", Arrays.asList("Central", "Circle", "Hammersmith & City", "Metropolitan"));
       stationLinesMap.put("Waterloo", Arrays.asList("Bakerloo", "Jubilee", "Northern", "Waterloo & City"));
       stationLinesMap.put("Victoria", Arrays.asList("Circle", "District", "Victoria"));
       stationLinesMap.put("Leicester Square", Arrays.asList("Northern", "Piccadilly"));
       stationLinesMap.put("Charing Cross", Arrays.asList("Bakerloo", "Northern"));
       stationLinesMap.put("Green Park", Arrays.asList("Jubilee", "Piccadilly", "Victoria"));

       // Prompt user for a station name
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a Zone 1 station name: ");
       String stationName = scanner.nextLine().trim();

       // Check if the station is in the map and display the lines
       if (stationLinesMap.containsKey(stationName)) {
           List<String> lines = stationLinesMap.get(stationName);
           System.out.println("Lines that pass through " + stationName + ": " + String.join(", ", lines));
       } else {
           System.out.println("Station not found in Zone 1 or invalid station name.");
       }

       scanner.close();
   }

}

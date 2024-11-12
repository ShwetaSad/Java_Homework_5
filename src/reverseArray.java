import java.util.Arrays;

public class reverseArray {

    //Write a Java program to reverse an array of integer values.

    // Method to reverse an Array of Integers
    public static void reverse(int []array){
        int start = 0;
        int end = array.length - 1;

    // swap elements from the start and end until they meet int the middle
        while (start<end){
            // Swap elements at index start and end
            int temp = array[start];
            array[start]= array[end];
            array[end] = temp;

            // move towards the centre
            start++;
            end--;


        }
    }
    // Main Method to test reverse method
    public static void main(String[] args) {
        int[]numbers= {1,2,3,4,5};
        System.out.println("Original array: "+ Arrays.toString(numbers));

        // call the reverse method
        reverse(numbers);
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}

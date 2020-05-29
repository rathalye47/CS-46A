import java.util.*;

public class Swap
{
    public static void main(String[] args)
    {
        // Make a random array of even length between 10 and 20
        // containing numbers between 0 and 99
        Random generator = new Random();
        int n = 10 + 2 * generator.nextInt(6);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) 
            numbers[i] = generator.nextInt(100);

        // Here is the array
        System.out.println(Arrays.toString(numbers));

        // Swap adjacent neighbors

        for (int i = 0; i < n; i = i + 2)
        {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }

        // Here is the array after swapping
        System.out.println(Arrays.toString(numbers));
    }
}
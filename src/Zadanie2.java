import java.util.Random;
import java.util.Arrays;
public class Zadanie2 {
    public static void main(String[] args) {


        int[] jctablica = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            jctablica[i] = random.nextInt(100);
            System.out.println(jctablica[i]);
        }
            Arrays.sort(jctablica);
            for(int i=0;i<10;i++)
            {
            }
            System.out.println("Najmniejsza wartość: " +jctablica[0]);
            System.out.println("Najmniejsza wartość: " +jctablica[9]);

    }
}
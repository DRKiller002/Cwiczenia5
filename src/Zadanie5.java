import java.util.*;
public class Zadanie5 {
    public static void main(String[] args){
            String jcslowo, jcodtylu = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj słowo");
            jcslowo = in.nextLine().toUpperCase();
            int length = jcslowo.length();
            for ( int i = length - 1; i >= 0; i-- )
                    jcodtylu = jcodtylu + jcslowo.charAt(i);
            if (jcslowo.equals(jcodtylu))
                    System.out.println("Jest palindromem");
            else
                    System.out.println("Nie jest palindromem");
    }
}

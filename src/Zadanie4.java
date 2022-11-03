import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jclan1,jclan2;

        System.out.println("Podaj pierwszy łańcuch");
        jclan1=sc.nextLine();
        System.out.println("Podaj drugi łańcuch");
        jclan2=sc.nextLine();

        System.out.println("Połączone łańcuchy1 i 2: " + jclan1.concat(jclan2));
        System.out.println("Połączone łańcuchy2 i 1: " + jclan2.concat(jclan1));


    }
}

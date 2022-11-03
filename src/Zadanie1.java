public class Zadanie1 {
    public static void main(String[]args){
       int[] jctablica=new int[10];
       int i;
       for (i=9;i>=0;i--){
           jctablica[i]=9-i;
       }
       for(i=9;i>=0;i--){
           System.out.println(("Element tablicy["+ i + "]:"+ jctablica[i]));
       }
    }
}

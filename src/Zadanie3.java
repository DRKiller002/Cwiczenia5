public class Zadanie3 {
    public static void main(String[] args) {
        int jcmatrix[][]=new int[10][10];
        int jcprzekatna=0;
        for(int t=0;t<10;t++){
            for(int i=0;i<10;i++){
                if(t==i){
                    jcmatrix[t][i]=t;
                    jcprzekatna+=t;
                }
                else{
                    jcmatrix[t][i]=0;
                }
            System.out.println(jcmatrix[t][i]+" ");
            }
        }
        System.out.println("Suma przekątnej"+jcprzekatna);
    }
}


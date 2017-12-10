import java.util.Arrays;

public class demot4_1 {
    public static void main(String[] args){
        int[] testiTaulu = new int[10];
        int testiLuku  = 11;
        lisaaLukuja(testiTaulu, testiLuku);
        System.out.println(Arrays.toString(testiTaulu));
    }
    public static void lisaaLukuja(int[] taulu, int luku){
        for (int i = 0; i < luku; i++){
            if (i < taulu.length){ //jos taulukossa on vielä tilaa
                taulu[i] = i;
            }else{      //jos taulussa ei ole tilaa
                taulu[i-taulu.length] = i;
            }
        }
    }
}

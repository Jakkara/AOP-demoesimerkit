import java.util.Arrays;

public class demot4_2 {
    public static void main(String[] args){
        int[] testiTaulu1 = {2,5,7,0};
        int[] testiTaulu2 = {1,3,6,8,7};
        muutaTauluja(testiTaulu1, testiTaulu2);
        System.out.println(Arrays.toString(testiTaulu2)); //vielä tarkistetaan
    }
    public static int[] muutaTauluja(int[] taulu1, int[] taulu2){
        for (int i = 0; i < taulu1.length; i++) {
            int annettuIndeksi = taulu1[i]; //taulussa 1 oleva luku on indeksiluku
            if (annettuIndeksi < taulu1.length-1){ //jos taulussa 2 on tämä indeksi...
                System.out.println(taulu2[annettuIndeksi]);
                taulu2[annettuIndeksi] = 0; //nollataan siinä kohtaa oleva luku
            }
        }
        return taulu2;
    }
}

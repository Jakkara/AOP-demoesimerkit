import java.util.Arrays;
import java.util.Random;

public class demot4_5 {
    public static void main(String[] args){
        Random rng = new Random();
        int[] taulu1 = arvoTaulukko();
        int[] taulu2 = arvoTaulukko();
        if(taulu1.length == taulu2.length){//jos yhtä pitkät taulut, tarkista ovatko samanlaiset
            System.out.println(Arrays.equals(taulu1, taulu2)); //tulostaa true tai false, ovatko taulut samanlaiset
        }
    }


    public static int[] arvoTaulukko(){ //arpoo lukuja tauluun
        Random rng = new Random();
        int[] taulukko = new int[rng.nextInt(20)]; //arpoo taulukolle koon
        for (int i = 0; i < taulukko.length; i++) {
            do{
                taulukko[i] = 2*rng.nextInt(); //arvotaan taulukkoon parillinen luku
            }while(taulukko[i] % 4 == 0); //jatketaan yllä olevaa kunnes saadaan luku, joka ei enää ole neljällä jaollinen
        }
        return taulukko;
    }
}

import java.util.Random;

public class demot4_3 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] taulu = new int[rng.nextInt(15)+5]; //arvotaan taululle koko 5-19

        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = rng.nextInt(20); //arvotaan taulun kohtiin arvoja välillä 0-19
        }
        int[] tauluMuutettu = muutaMuutamaLuku(taulu); //luodaan uusi taulu jossa muutama luku muutettu -1
        vertaile(taulu, tauluMuutettu);

    }

    public static int[] muutaMuutamaLuku(int[] alkuperTaulu) {
        int[] taulu = alkuperTaulu.clone(); //luodaan uusi taulukko samoilla luvuilla
        Random rng = new Random();
        int montako = rng.nextInt(3) + 1; //arvotaan 1-3 alkiota muutettavaksi
        for (int i = 0; i < montako; i++) {
            taulu[rng.nextInt(taulu.length)] = -1; //arvotaan mikä kohta muutetaan, ylärajana taulun koko
        }
        return taulu;
    }
    //tulostaa kaikki taulukkojen luvut ja ilmoittaa mikä on muutettu
    public static void vertaile(int[] alkuperTaulu, int[] muutettuTaulu) {
        for (int i = 0; i < muutettuTaulu.length; i++) {
            if (muutettuTaulu[i] == -1) { //jos löydetään muutettu kohta...
                System.out.println(alkuperTaulu[i] + " Muutettu!"); //tulostetaan alkuperäinen arvo ja ilmoitetaan sen olevan muutettu
            } else {
                System.out.println(muutettuTaulu[i]);
            }
        }
    }
}

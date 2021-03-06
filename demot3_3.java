import java.util.Random;
import java.util.Scanner;

public class demot3_3 {

    public static void main(String[] args){
        teht3();
    }

    private static void teht3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Anna merkkijono:");
        String mjono = scan.nextLine();
        System.out.println("Anna etsittävät merkit:");
        String merkit = scan.nextLine();
        scan.close();

        int merkkienMaara = laskeMerkit(mjono, merkit);
        String muodostettavaMerkkijono = "";
        if(merkkienMaara %2 == 0){
            tuotaParillinenMerkkijono(muodostettavaMerkkijono);
        }else{
            muodostettavaMerkkijono = "0";
        }
        System.out.println("Muodostettava merkkijono on :" +muodostettavaMerkkijono); //****lisätty tämä. nähdään, minkä jonon viimeistä merkkiä yritetään hakea. jos haetaan tyhjää jonoa, homma kaatuu outofbounds-virheeseen.

        System.out.println("Viimeiseksi merkiksi muodostui "+viimeinenMerkki(muodostettavaMerkkijono));

    }

    /**
     * Laskee esiintymien määrän
     * @param mjono merkkijono, josta merkkejä etsitään
     * @param merkit merkkijono, jota etsitään
     * @return kuinka monta kertaa merkkijono merkit esiintyi merkkijonossa mjono
     */
    private static int laskeMerkit(String mjono, String merkit) {
        int maara = 0;
        //indexOf palauttaa -1, kun etsittävää merkkijonoa ei löytynyt. Muulloin palautuu indeksi, josta merkkijono alkaa.
        for(int i=mjono.indexOf(merkit); i>=0; i=mjono.indexOf(merkit, i+1)){
            maara++;
        }
        return maara;
    }

    /**
     * Tuotetaan uusi nelinumeroinen merkkijono. Merkkijono on parillinen kokonaisluku.
     * @param muodostettavaMerkkijono merkkijono, johon numeroita kerätään. On lopuksi parillinen sekä nelinumeroinen.
     */
    private static void tuotaParillinenMerkkijono(String muodostettavaMerkkijono) {
        Random rand = new Random();
        for(int i=0; i<4; i++){
            int luku = rand.nextInt(10);
            if(i==3){
                //viimeinen kierros: varmistetaan parillinen, yksinumeroinen luku
                if(luku % 2==1){
                    luku++;
                    luku %= 10;
                }
            }
            muodostettavaMerkkijono += luku;
        }
    }

    /**
     * Palauttaa viimeisen merkin annetusta merkkijonosta.
     * @param mjono Merkkijono, josta viimeinen merkki halutaan
     * @return yksi merkki.
     */
    private static char viimeinenMerkki(String mjono) {
        return mjono.charAt(mjono.length()-1);
    }//***kaataa ohjelman kutsuttaessa tyhjällä merkkijonolla

}
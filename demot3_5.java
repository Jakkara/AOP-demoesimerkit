import java.util.Scanner;

public class demot3_5 {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä jotain");
        String luettu = lukija.nextLine();
        int pituus = luettu.length();
        System.out.println("Merkkien määrä on " + pituus);
        printteri(pituus);
        printtaaJotainRoskaa(luettu);
        printteri(pituus);

    }
    public static void printteri(int amount){
        for (int i = 0; i<amount; i++){
            System.out.print('*'); //printtaa riskejä
        }
        System.out.println(""); //rivin vaihto
    }
    public static void printtaaJotainRoskaa(String feed){
        System.out.println("Tulostetaan joku epämääräinen häröpallo asteriskeja");
        for (int i = 0; i < feed.length(); i++){
            char c = feed.charAt(i); //tutkitaan nykyistä merkkiä
            int laskuri = 0; //laskuri nollille
            for (int j = 0; j < feed.length(); j++){ //verrataan nykyistä merkkiä koko jonoon
                if (c == feed.charAt(j)){
                    laskuri++;
                }
            }printteri(laskuri);
        }
    }

}

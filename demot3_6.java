import java.util.ArrayList;
import java.util.Scanner;

public class demot3_6 {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä sanoja");
        String sanat = lukija.nextLine();
        int sanamaara = laskeSanat(sanat);
        kokonaisLukujenSumma(sanamaara);
        if (onkoPalindromi(sanat)){
            System.out.println("No on.");
        }

    }
    public static int laskeSanat(String jono){
        int summa = 0;
        for (int i = 0; i < jono.length(); i++){ //jos nykyinen merkki on välilyönti ja seuraava merkki ei ole, kyseessä on sana
            if (jono.charAt(i) == ' ' && jono.charAt(i + 1) != ' '){
                summa++;
            }
        }return summa;
    }
    public static void kokonaisLukujenSumma(int n){
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        for (int i = 0; i <= n; i++){
            System.out.println("Syötä luku");
            int luettu = lukija.nextInt();
            summa += luettu;
        }lukija.close();
        System.out.println(summa);
    }
    public static boolean onkoPalindromi(String mjono){
        for (int i = 0; i < mjono.length() / 2; i++){
            char c = mjono.charAt(i);
            char d = mjono.charAt(mjono.length()-1-i);
            if (c != d){return false;}
        }return true;
    }
}

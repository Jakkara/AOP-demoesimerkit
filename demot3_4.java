import java.util.Scanner;

public class demot3_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Syötä merkkijono");
        String jono = s.nextLine();
        String puhdas = poistaErikoismerkit(jono);
        System.out.println("Valmis : " + puhdas);
    }
    public static String poistaErikoismerkit(String jono){
        String valmis = jono.replaceAll("[^a-zåäöA-ZÅÄÖ0-9]"," "); //poistaa kaiken joka ei sovi regexiin
        return valmis;
    }
}

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä merkkijono : ");
        String jono = lukija.nextLine(); //lukee käyttäjän jonon


        String caesarJono = caesar(jono); //kysyy caesar-metodilta muokatun jonon
        System.out.print(caesarJono);
    }



    public static String caesar(String jono){ //siirtää jokaista kirjainta yhdellä
        String palaute = ""; //merkkijono joka luodaan ja palautetaan
        for (int i = 0; i < jono.length(); i++){
            char c = (char)(jono.charAt(i) + 1); //lue kirjain ja siirrä sitä yhdellä
            palaute += c; //lisää uusi kirjain jonon perään
        }return palaute; //palauta valmis jono
    }
}

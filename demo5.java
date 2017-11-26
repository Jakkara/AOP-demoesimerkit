import java.util.Scanner;

public class demo5 {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in); //luetaan kaikki jonot
        System.out.println("Syötä merkkijono A :");
        String a = lukija.nextLine();
        System.out.println("Syötä merkkijono B :");
        String b = lukija.nextLine();
        System.out.println("Syötä merkkijono C :");
        String c = lukija.nextLine();

        String haetutMerkit = "";       //talletaan löydetyt merkit tähän
        for (int i = 0; i < a.length(); i++) { //tutkitaan läpi a-jono
            char merkki = a.charAt(i); //tutkitaan jokainen merkki erikseen
            if (b.indexOf(merkki) == -1 && c.indexOf(merkki) == -1) { //jos merkkiä ei löydy b:stä tai c:stä
                haetutMerkit += merkki; //todetaan sen olevan vain a:ssa
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char merkki = b.charAt(i);
            if (a.indexOf(merkki) == -1 && c.indexOf(merkki) == -1) {
                haetutMerkit += merkki;
            }
        }for (int i = 0; i < c.length(); i++) {
            char merkki = c.charAt(i);
            if (a.indexOf(merkki) == -1 && b.indexOf(merkki) == -1) {
                haetutMerkit += merkki;
            }
        }System.out.println(haetutMerkit);
    }
}


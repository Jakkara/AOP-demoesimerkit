/*ongelmana on taulukon arpova int[] tka(), joka arpoo 10-17 pituisen taulukon, ja arpoo sen jokaiseen kohtaan alkion. alkiot saavat arvon, joka on aina vähintään yksi ja korkeintaan niiden indeksi taulussa + 1. Tämän takia taulukon keskiarvo ei koskaan kasva tarpeeksi suureksi, jotta se ylittäisi viiden. Tämä taas on ongelma, koska ohjelma tulostaa keskiarvon vain, jos se on on yli viisi.
*/

import java.util.Random;

public class tka {

    public static int rvtra = 11;
    public static void main(String[] tk){
        double tka = 0;
        while(tka(tka)){ //kutsuu alimmaista booleania, on totta kun kutsun double on alle 5
            tka = tka(tka());} //kutsuu ensin keskimmäistä metodia, joka palauttaa int[], joka sisältää 7-18 pituisen taulukon, jonka luvut on arvottu.
        // tämän jälkeen arvottu taulukko syötetään doublen palauttavalle tka:lle, joka vuorostaan palauttaa taulukon keskiarvon. keskiarvo talletetaan tka-doubleen.
        if(tka(tka)){
            System.out.println(tka); //jos keskiarvo on yli 5, tulosta se
        }else{
            System.out.println(0);}} //jos keskiarvo on alle 5, tulosta 0

    public static int[] tka(){                  //arpoo satunnaisluvuilla täytetyn taulukon
        Random ka = new Random();
        int[] tk = new int[ka.nextInt(rvtra)+7];    //taulukko kooltaan 10-17 alkiota
        for(int tka = 0; tka < tk.length; tka++){
            tk[tka] = ka.nextInt(tka+1)+1;} //taulukkoon arvotaan lukuja, jotka ovat aina vähintään 1 ja korkeintaan indeksiä yhtä suurempia
        return tk;}

    private static double tka(int[] tk) { //palauttaa sille syötetyn taulukon keskiarvon
        if(tk.length == 0)
            return 0;
        int tka = 0;
        for(int tka1 : tk){
            tka += tka1;}
        return tka/tk.length;}

    public static boolean tka(double tka)           //tarkistaa, onko sille syötetty luku alle 5
    {return tka < 5;}

}
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä numero");
        int luku = lukija.nextInt(); //luetaan luku
        String tulos = "";      //jono johon kirjoitetaan kaikki vastaukset

        for (int i = 1; i <= luku ; i++){
            tulos += fibonacci(i) + " "; //kysy fibonacci-metodilta oikea luku
            tulos += tokaSarja(i) + " "; //kysy tokaSarja-metodilta oikea luku

        }
        System.out.println(tulos);
    }
    public static int fibonacci(int n){//palauttaa fibonaccin n:nen luvun
        if (n <= 1) return n;   //mallivastaus netistä
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static int tokaSarja(int n){ //palauttaa tokan sarjan n:nen luvun
        int palauta = 1;
        int summattava = 3; //luku joka summataan palautettavaan joka kierros
        for (int i = 1; i < n; i++){
            palauta += summattava; //summataan luvut
            summattava += 2;        //seuraavalla kerralla lisätään suurempi luku
        }return palauta;
    }
}

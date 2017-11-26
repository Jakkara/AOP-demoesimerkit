import java.util.Scanner;

public class Demo2_teht6 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Anna luku A:");
        int a = s.nextInt();
        if(a < 0){
            System.out.println("Luvun täytyy olla positiivinen. Anna uusi luku:");
            a = s.nextInt();
        }

        System.out.println("Kiitos! Anna luku B:");
        int b = s.nextInt();

        tulostaNeliojuuri(a);

        int temp = 0;
        //otetaan jakojäännös A:sta neljä kertaa, jostain syystä
        for (int i = 0; i < 4; i++){
            if (a>0){
                temp = a;
                a = b%a;
                b = temp;
                System.out.println("Vielä on jaettavaa jäljellä.");
                System.out.println("temp : " + temp + "\na : " + a + "\nb : " + b);

            }else {System.out.println("Lasku ei enää etene.");
            }

        }

        temp = b;
        System.out.println("Jäljelle jäänyt luku: " + b);
        System.out.println("Luetellaan kaikki luvut tästä ykköseen, koska miksei.");

        for (; temp > 0; temp--){ //tulosta tempin kaikki arvot yksitellen lähestyen nollaa. tempin oltava positiivinen.
            System.out.println(" > " + temp);
        }
    }

    public static void tulostaNeliojuuri(int n){
         System.out.println("Luvun A neliöjuuri on : "+ (Math.sqrt((double) n)) + "\n ---");

    }

}
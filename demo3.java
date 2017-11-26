public class demo3 {
    public static void main(String[] args) {
        int annettuLuku = Integer.parseInt(args[0]);
        if ((annettuLuku % 2) == 0) {
            System.out.println("Ei ole pariton luku");
        }


        //tulostetaan tähti kahdessa osassa

        int puolivali = annettuLuku / 2 + 1;

        //ensin ylhäältä keskiriviin asti
        for (int i = 0; i < puolivali; i++) { //looppaa alusta keskelle
            int aukkoja = puolivali - i - 1; //välilyöntien määrä lasketaan joka riville uudestaan
            int asteriskit = 1 + i * 2;     //asteriskien määrä lasketaan uudestaan
            for (int j = 0; j <= aukkoja; j++){ //asetetaan välejä oikea määrä
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskit; j++){ //asetetaan väliin asteriskit
                System.out.print("*");
            }
            for (int j = 0; j <= aukkoja; j++){ //asetetaan uudestaan välejä
                System.out.print(" ");
            }
            System.out.println("");     //rivivaihto
        } //looppaa -> aloita seuraava rivi

        /**
         * tulostetaan keskirivin alla olevat. looppi aloittaa nyt keskeltä ja pienenee kohti nollaa. muuten identtinen yllä olevan kanssa
         */
        for (int i = puolivali; i >= 0 ; i--){
            int aukkoja = puolivali - i - 1;
            int asteriskit = 1 + i * 2;
            for (int j = 0; j <= aukkoja; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskit; j++){
                System.out.print("*");
            }
            for (int j = 0; j <= aukkoja; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}

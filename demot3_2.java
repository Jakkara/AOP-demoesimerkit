import java.util.Random;

public class demot3_2 {
    public static void main(String[] args){
        Random rng = new Random();
        int noppia = rng.nextInt(20) + 4; //arvo random väli 4-24
        int tahkoja = rng.nextInt(20) + 4;
        System.out.println("Noppia :" + noppia);
        System.out.println("Tahkoja :" + tahkoja);
        System.out.println("Summa :" + heitaNoppaa(noppia,tahkoja));

    }
    public static int heitaNoppaa(int noppia, int tahkoja){
        Random rng = new Random();
        int sum = noppia * rng.nextInt(tahkoja + 1); //arvo random väli 1->tahkoja
        return sum;
    }
}


public class demot3_1 {
    public static void main(String[] args){
        String testi = "saippuakauppias";
        if(onkoPalindromi(testi))System.out.print("pekka");
    }
    public static boolean onkoPalindromi(String mjono){
        for (int i = 0; i < mjono.length() / 2; i++){
            char c = mjono.charAt(i);
            char d = mjono.charAt(mjono.length()-1-i);
            if (c != d){return false;}
        }return true;
    }
}

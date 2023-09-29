import java.util.Scanner;

public class Esercizio3 {
    public static String invertiStringa(){
        String frase = "Come stai";
        String[] frase_split = frase.split(" ");
        String reverse = frase_split[1]+" "+frase_split[0];
        return reverse;
    }
}

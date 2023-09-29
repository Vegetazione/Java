import java.util.Scanner;

public class Esercizio6 {



    public static boolean isPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci parola palindroma");
        String parola = scanner.next();
        String reverse = stringReverse(parola); //trovo la frase palindroma utilizzando il metodo sotto
        if(parola.equalsIgnoreCase(reverse)){ //se la parola inserita è uguale a quella al contrario allora ritorna che è palindroma
            return true;
        }
        return false;
    }

    public static String stringReverse(String parola){
        String risultato = "";
        for(int i=parola.length()-1;i>=0;i--){
            String lettera = String.valueOf(parola.charAt(i)); //casting
            risultato+= lettera;
        }
        return risultato; //restituisce la parola al contrario
    }


}

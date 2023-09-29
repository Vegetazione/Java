import java.util.Scanner;

public class Esercizio8 {

    //Scrivete un programma che data una parola stampa a schermo il numero di vocali e
    //consonanti presenti.

    public static void controlla(){
        char[] vocali = {'a','e','i','o','u'};
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.next();
        int couner_vocali = 0;

        for(int i=0;i<vocali.length;i++){  //ciclo che prende vocale per vocale
           for(int j=0;j<frase.length();j++){ //ciclo che prende lettera per lettera della frase
               if(frase.charAt(j) == vocali[i]){ //se la vocale coincide con la lettera
                   couner_vocali++; //incrementa le vocali
               }
           }
        }
        int consonanti = frase.length()-couner_vocali; //sottraggo dalla frase le vocali e ottengo le consonanti
        System.out.println("Consonanti: " + consonanti + ", Vocali: "+couner_vocali);
    }
}

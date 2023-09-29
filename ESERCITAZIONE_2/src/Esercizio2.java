import java.util.Scanner;

public class Esercizio2 {

    /*
    Scrivere un metodo che, data una stringa s in input, ne stampi il reverse, ossia la stringa al contrario. Esempio: data la stringa «ciao», dovrà stampare «oaic».
    Suggerimento: inserite il codice della vostra soluzione all’interno del
    metodo stringReverse del codice che trovate a questo indirizzo:
     */

    public static void stringReverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci parola");
        String value = scanner.next();
        for(int i=value.length()-1;i>=0;i--){ //leggo la parola al contrario (dall'ultimo indice) e stampo la lettera
            System.out.print(value.charAt(i));
        }
    }

}

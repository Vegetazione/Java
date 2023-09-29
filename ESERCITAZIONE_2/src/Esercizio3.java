import java.util.Scanner;

public class Esercizio3 {

/*
Scrivere un metodo che, dato in input un intero a, ritorni true se il numero è primo, false altrimenti.


Suggerimento: inserite il codice della vostra soluzione all’interno del metodo isPrime
 del codice che trovate a questo indirizzo:

 */

    public static boolean isPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = scanner.nextInt();
        if(numero == 2){
            return true;
        }
        if(numero % 2 == 0  || numero == 0) {
            return false;
        }
        for( int i = 3 ; i < (numero / 2) ; i += 2 ){
            if(numero % i == 0 ){
                return false ;
            }
        }
        return true ;
    }


}

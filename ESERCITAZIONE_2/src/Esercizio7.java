import java.util.Scanner;

public class Esercizio7 {
    /*
    Il quadrato di un numero N non è altro che la somma dei primi N numeri dispari.
    Per esempio 9 = 5+3+1 e 36 = 11+9+7+5+3+1
    Scrivete un programma che preso in input un numero N restituisce il quadrato di N
    utilizzando questo metodo!
     */


    public static void quadrato(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci n: ");
        int valore = scanner.nextInt();
        System.out.print(valore+"=");
        int somma=0;
        for(int i=0;i<valore;i++){  //prende tutti i valori minori di (valore) cioè tutti quelli minori di quello inserito dall'utente
            if(i%2 != 0){       //consideriamo tutti i numeri dispari
                somma+= i;      //sommiamo tutti i numeri dispari
                System.out.print(i+"+");
                if(somma==valore){      //se ha già raggiunto la somma di 9 allora si ferma il ciclo e termina
                    break;
                }
            }
        }
        System.out.println("\n"+somma);
    }
}

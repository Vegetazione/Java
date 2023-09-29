import java.util.Scanner;

public class Esercizio5 {

    /*
    Scrivere un programma che, dato un intero n in input, calcoli la somma di
    una serie armonica fino a n, ossia:

     */

    public static void harmonicSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci n:");
        int n = scanner.nextInt();
        double somma = 0;
        for(int i=1;i<=n;++i){  //ciclo che va sommando 1/n con n che si incrementa, parte da 1 perchè la serie armonica ha la costante +1
            somma+= (double) 1  / (double) i; // qui viene sommato
        }
        System.out.println("Somma serie armonica: " + somma);
    }
}

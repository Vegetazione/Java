import java.util.Scanner;

public class Esercizio1 {

  public static void calcolatrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci primo numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Inserisci secondo numero:");
        int numero2 = scanner.nextInt();
        int somma = numero1+numero2;
        int differenza = numero1-numero2;
        int moltiplicazione = numero1*numero2;
        int divisione = numero1/numero2;

        System.out.println("Somma="+somma);
          System.out.println("Diff.="+differenza);
          System.out.println("Mol.="+moltiplicazione);
          System.out.println("Div.="+divisione);

  }
}

import java.util.Scanner;

public class Esercizio4 {
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int inserito = scanner.nextInt();
        int value = inserito;
        int fattoriale=1;           //parte da 1 perchè se parte da 0 fa 0 * la parte restante che fa 0
        while(value>=1){            //ripeti fino a quando il valore è >=1 (non deve arrivare a 0 altrimenti annulla il fattoriale)
            fattoriale *= value;    //fattoriale = fattoriale * value;
            value--;                //decrementa il valore di -1
        }
        System.out.println("Fattoriale del numero " + inserito + ": " + fattoriale);
    }
}

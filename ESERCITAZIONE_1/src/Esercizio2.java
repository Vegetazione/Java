import java.util.Scanner;

public class Esercizio2 {
    public static boolean checkEvenOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int value = scanner.nextInt();
        if(value%2==0){
            return true;
        }
        return false;
    }
}

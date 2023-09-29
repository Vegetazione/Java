import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");
        //metodo lenght
        String s="Java dev";
        int lenght= s.length();
        System.out.println("La lunghezza della stringa è " + lenght);
        //metodo equals
        String new_s="Java";
        boolean b= s.equals(new_s);
        System.out.println("LE stringhe sono uguali? " + b);
        //metodo startswith
        boolean startwith= s.startsWith("Java");
        System.out.println("Java è un prefisso di javadeveloper? "+ startwith);
        //uppercase
        System.out.println("La stringa di partenza e "+ s.toUpperCase());
        //indexof
        int index=s.indexOf("dev");
        System.out.println("La stringa dev inizia in posizione "+ index);
        //replace
        s=s.replace("Java", "phython");
        System.out.println(s);
        //split
        String[] parole= s.split(" ");
        System.out.println("Le parole sono: "+ Arrays.toString(parole));
    }


}

/*
*
*
 public static String lunghezzaStringa(){
 * Scanner myScanner= new Scanner(System.in);
 * System.out.println("ciao! Inserisci stringa");
 * String stringaInserita= myScanner.nextLine();
 * if(stringaInserita.length()>10){
 *  return "STRINGA LUNGA";
 * }
 * else{
 * return "STRINGA CORTA";
 * }
 *  */
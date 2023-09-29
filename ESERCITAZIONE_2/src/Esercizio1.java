public class Esercizio1 {
    /*
    Scrivere un metodo che, dato un char a e una stringa b, stampa il numero di occorrenze di a in b.
    Suggerimento: inserite il codice della vostra soluzione all’interno del metodo countOccurrences del codice che trovate a
    questo indirizzo:
     */

    public static void countOccurrences(char a, String b){
        int occorrenze = 0;
        //tutto
        //t = t ? si -> +1
        //u = t? no
        //t = t ? si -> +1

        //occorrenze = occorreze +1 ;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==a){
               occorrenze++;
            }
        }
        System.out.println("Occorrenze: "+ occorrenze);
    }

}

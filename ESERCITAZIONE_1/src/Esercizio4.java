public class Esercizio4 {
    public static void replaceIntruder(){

        String a = "ciao";
        String b = "boh";
        String c = "pippo ciaopippociao java boh";
        //pippo bohpippiboh java boh
        System.out.println(c.replaceAll(a,b));
    }
}

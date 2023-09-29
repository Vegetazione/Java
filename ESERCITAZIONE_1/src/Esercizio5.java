public class Esercizio5 {
    public static void compareStrings(){
        String a = "javalll";
        String b = "javadd";
        String c = "javawww";

        //a.equals(b) || b.equals(c) || c.equals(a)

        if(a.equals(b) && b.equals(c)) {
            System.out.println("3");
        }else if(a.equals(b) || b.equals(c) || c.equals(a)){
            System.out.println("2");
        }else{
            System.out.println("0");
        }





    }
}

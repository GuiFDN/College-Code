public class TesteStringArgs {
    public static void main (String args []) {
        System.out.println ("Foram digitados " + args.length + "parametro");
        for (int i = 0; i < args.length; i ++) {
            System.out.println (args [i]);
        }
}
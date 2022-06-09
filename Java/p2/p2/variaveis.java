public class variaveis {
    public static void main(String[] args) {
        System.out.print("\n");
        // Primeiro loop
        for (int contador = 100; contador != 0; contador --) {
            System.out.printf("%d ", contador);
        }
        System.out.println("\n");
        // Segundo loop
        int contador = 100;
        while (contador != 0) {
            System.out.printf("%d ", contador);
            contador --;
        }
        System.out.println("\n");
        // Terceiro loop
        contador = contador + 100;
        do {
            System.out.printf("%d ", contador);
            contador --;
        } while (contador != 0);
        System.out.println("\n");
    }
}

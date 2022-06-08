public class TesteSobrecarga {
    public static void main (String args []) {
        int x = 2, y = 3, z = 4;
        String s1 = "50", s2 = "60";
        float f1 = 56.7f . f2 - 0.3f;
        Calculadora c = new Calculadora (5, 6);

        System.out.println ("Soma de dois inteiros: " + c.soma (x, y));

        System.out.println ("Soma de tres inteiros: " + c.soma(x, y, z));

        System.out.println ("Soma de doubles" + c.soma (2.4, 6.8));

        System.out.println ("Soma das strings " + c.soma ("12", "3.5"));

        System.out.println ("Soma dos atributos: " + c.soma());
    }
}

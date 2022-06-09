public class CalculadoraCientifica {
    
    public Double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }

    public Double potencia(String a, String b) {
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }

    public Double potencia(int a, double b) {
        return Math.pow(a, b);
    }

    public Double radioEEsal(int a) {
        return Math.sqrt(a);
    }

    public Double radioEEsal(Double a) {
        return Math.sqrt(a);
    }

    public Double radioEEsal(String a) {
        return Math.sqrt(Double.parseDouble(a));
    }
    
    public static void main(String[] args) {
        CalculadoraCientifica ula = new CalculadoraCientifica();
        ula.potencia(2, 2);
        ula.potencia("2", "2");
        ula.potencia(2, 3.0);
        ula.radioEEsal(4);
        ula.radioEEsal(4.0);
        ula.radioEEsal("4");
    }
}

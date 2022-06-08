public class Carros {
    private String Modelo;
    private String Cor;
    
    public void setModelo (String Modelo) {
        this.Modelo = Modelo;
    }
    public String getModelo() {
        return Modelo;

    }
    public void setCor (String Cor) {
        this.Cor = Cor;
    }

    public String getCor() {
        return Cor;
    } 

    public void exibirMensagen () {
        System.out.printf ("\nModelo do carro eh %s com sua cor sendo %s", getModelo(), getCor());
    }

    public void ligar(){
        System.out.print ("\nCarro foi ligado");
    }

    public void desligar(){
        System.out.print ("\nCarro foi desligado");
    }
}

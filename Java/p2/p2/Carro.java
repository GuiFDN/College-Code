public class Carro {

    private String cor;
    private String modelo;

    public Carro (String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public void exibirCor (String cor) {
        System.out.printf("A cor do carro eh %s\n", cor);
    }

    public void exibirModelo (String modelo) {
        System.out.printf("O modelo do carro eh %s", modelo);
    }

    public String getCor() {
        return cor;
    }

    public String getModelo () {
        return modelo;
    }

    public void setCor (String cor) {
        this.cor = cor;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
}

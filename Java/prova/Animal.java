public class Animal {
    private String nome;
    private int patas;

    public Animal () {}
    public Animal (String nome)  {
        setNome(nome);
    }
    public Animal (int patas, String nome) {
        setNome (nome);
        setPatas (patas);
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
}

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa () {}
    public Pessoa (String nome) {
        this.nome = nome;
    }
    public Pessoa (int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    // modificadores
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
}
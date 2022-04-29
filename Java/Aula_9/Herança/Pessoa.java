public class Pessoa {
    // atributos encapsulados
    private int idade;
    private String nome;
    // construtores
    public Pessoa () {}
    public Pessoa (String nome) {
        this.nome = nome;
    }
    public Pessoa (int idade, String nome) {
        // this.idade = idade;
        // this.nome = nome;
        this (nome);  // --> chamada para o construtor anterior
        this.setIdade (idade);
    }
    // modificadores
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    // métodos de acesso
    public int getIdade () {
        return this.idade;
    }
    public String getNome () {
        return this.nome;
    }
    // sobrescrever (redefinir) o método toString
    @Override // anotação
    public String toString () { // sem parâmetro
        return "nome: " + this.nome + "\nidade: " + this.idade;

    }  
}
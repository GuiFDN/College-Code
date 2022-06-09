public class Animal {
    private String nome;
    private int patas;

    public Animal () {}
    public Animal (String nome) {
        setNome(nome);
    }
    public Animal (int patas, String nome) {
        setPatas(patas);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas () {
        return patas;
    }

    public void setPatas (int patas) {
        this.patas = patas;
    }

}
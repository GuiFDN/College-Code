public class Aluno extends Pessoa {
    private String ra;
    // construtores sobrecarregados
    public Aluno () {}
    public Aluno (String nome, String ra) {
        super (nome);
        this.setRa (ra);
    }
    public Aluno (int idade, String nome, String ra) {
        super (idade, nome);
        this.setRa (ra);
    }
    public Aluno (String ra) {
        super (); // <-- ele faz isso automaticamente
        this.setRa (ra);
    }
    // modificadores
    public void setRa (String ra) {
        this.ra = ra;
    }
    // método de acesso
    public String getRa () {
        return this.ra;
    }
    @Override
    public String toString () {
        return super.toString () + "\nra: " + this.ra;
    }
}

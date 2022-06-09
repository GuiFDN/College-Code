public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem (String nome, int energia, int fome, int sono) {
        this.nome = nome;
        if(energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    void exibirStatus (int energia, int fome, int sono) {
        System.out.printf("%s\nEnergia: %d\nFome: %d\nSono: %d\n\n", getNome(), energia, fome, sono);
    }

    void cassar() {
        if (energia >= 2) {
            System.out.println(nome + " cassando");
            energia -= 2;
        } else {
            System.out.println(nome + " sem energia para cassar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        exibirStatus(energia, fome, sono);
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo.");
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        } else {
            System.out.println(nome + " sem fome.");
        }
        exibirStatus(energia, fome, sono);
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " dormindo.");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        } 
        else {
            System.out.println(nome + " sem sono.");
        }
        exibirStatus(energia, fome, sono);
    }

    public String getNome() {
        return nome;
    }

}

public class Testeum {
    public static void main (String [] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Ana", "22-345");
        Aluno aluno3 = new Aluno("22-678");
        Aluno aluno4 = new Aluno(21, "Gil", "21-567");

        //System.out.println ("aluno 1:\n" + aluno1.getNome() + "\n" + aluno1.getRa() + "\n" + aluno1.getIdade());
        //System.out.println ("aluno 2:\n" + aluno2.getNome() + "\n" + aluno2.getRa() + "\n" + aluno2.getIdade());
        //System.out.println ("aluno 3:\n" + aluno3.getNome() + "\n" + aluno3.getRa() + "\n" + aluno3.getIdade());
        //System.out.println ("aluno 4:\n" + aluno4.getNome() + "\n" + aluno4.getRa() + "\n" + aluno4.getIdade());

        Pessoa pessoa = new Pessoa (32, "Joao");
        System.out.println (pessoa);
        System.out.println (aluno4);
        
        System.out.println (aluno1);
        System.out.println (aluno2);
        System.out.println (aluno3);
    }   
}
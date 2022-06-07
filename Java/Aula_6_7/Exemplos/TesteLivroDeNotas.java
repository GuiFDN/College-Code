//aplicação
public class TesteLivroDeNotas {
    public static void main (String [] args) {
       
        LivroDeNotas livro1;
        livro1 = new LivroDeNotas ();

        LivroDeNotas livro2 = new LivroDeNotas ();

        livro1.exibirMensagem("Bem-vindos ao livro1");
        livro2.exibirMensagem("Bem-vindos ao livro2");

        livro1.setNomeDoCurso("CiC");
        livro2.setNomeDoCurso("Sis");

        System.out.println(livro1.getNomeDoCurso());
        System.out.println(livro2.getNomeDoCurso());
    }
}


//livro1.atribuiNomeDoCurso("CiC");
//livro2.atribuiNomeDoCurso("Sis");

//System.out.println(livro1.acessaNomeDoCurso());
//System.out.println(livro2.acessaNomeDoCurso());
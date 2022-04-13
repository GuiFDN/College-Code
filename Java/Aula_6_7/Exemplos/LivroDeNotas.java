public class LivroDeNotas{
    //variáveis de classe

    //variáveis de instância
    private String nomeDoCurso;

    //construtores
    public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    public LivroDeNotas (){
        this.nomeDoCurso = null;
    }

    //getters e setters
    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    //métodos específicos
    public void exibirMensagem (String msg){
        System.out.println(msg);
    }
    public void exibirMensagem () {
        System.out.println(this.nomeDoCurso);
    }
    
}
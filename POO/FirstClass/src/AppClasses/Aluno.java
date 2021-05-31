package AppClasses;

public class Aluno {
    
   private String nome;
   private int idade;
   private String dataNascimento;
   private String registroGeral;
   private String numeroCpf;
   private String nomeMae;
   private String nomePai;
   private String dataMatricula;
   private String nomeEscola;
   private String serieMatriculado;
   private double nota1;
   private double nota2;
   private double nota3;
   private double nota4;
  

//construtor: cria os dados na memoria. Sendo padrão do java
    public Aluno() {
    }

    //SET é para adicionar ou receber dados para os atributos.
    //GET é para resgatar ou obter o valor do atributo.


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return this.registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return this.numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return this.dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return this.serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }


    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return this.nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    //Método que retorna a média do aluno
    public double getMediaNota() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    //Método que retorna se o aluno foi aprovado ou não
    public boolean getAlunoAprovado() {
       double media = this.getMediaNota();
        if(media >= 70){
            return true;
        }else{
            return false;
        }

    }

    //Mesmo método do anterior, porém neste retorna uma mensagem, string
    public String getAlunoAprovado2() {
        double media = this.getMediaNota();

        //  if(media >= 70){
        //      return "Aluno aprovado :)";
        //  }else{
        //      return "Aluno reprovado :(";
        //  }

        // como operador ternario
     return   media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
 
     }



}

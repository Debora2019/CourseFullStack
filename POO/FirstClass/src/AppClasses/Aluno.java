package AppClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import constantes.StatusAluno;

//Classe filha da Superclasse Pessoa
public class Aluno extends Pessoa {
    
   private String dataMatricula;
   private String nomeEscola;
   private String serieMatriculado;
   private List <Disciplina> disciplinas = new ArrayList <Disciplina>();


    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
  
 

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
  

    //Método que retorna a média do aluno
    public double getMediaNota() {
        double somaNotas=0.0;
      
        for (Disciplina disciplina : disciplinas) {
           somaNotas += disciplina.getMediaNotas();
       }
        return somaNotas/disciplinas.size(); 
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

         if(media >= 50){
                if(media >= 70){
                     return StatusAluno.APROVADO; // foi criada uma classe onde consta as variaveis estáticas e aqui elas sao usadas.
                }else{
                    return StatusAluno.RECUPERACAO;
                }
         }else{
             return StatusAluno.REPROVADO;
         }

        // como operador ternario
     //return   media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
     }

     //identifica o método sobrescrito. dessa forma é possível mudar a regra de negocio, criar outros métodos e manter a consistencia de todo o codigo.
  @Override
  public boolean pessoaMaiorIdade() {
    //o super está chamando a superclasse Pessoa
      return super.pessoaMaiorIdade();
  }

  public String msgMaiorIdade() {
      return this.pessoaMaiorIdade() ? "O aluno é maior de idade" : "Voce é menor de idade";
  }

     //Método toString()
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", registroGeral='" + getRegistroGeral() + "'" +
            ", numeroCpf='" + getNumeroCpf() + "'" +
            ", nomeMae='" + getNomeMae() + "'" +
            ", nomePai='" + getNomePai() + "'" +
            ", dataMatricula='" + getDataMatricula() + "'" +
            ", nomeEscola='" + getNomeEscola() + "'" +
            ", serieMatriculado='" + getSerieMatriculado() +
            "}";
    }

   

    //Método Equals
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && idade == aluno.idade && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(registroGeral, aluno.registroGeral) && Objects.equals(numeroCpf, aluno.numeroCpf) && Objects.equals(nomeMae, aluno.nomeMae) && Objects.equals(nomePai, aluno.nomePai) && Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(nomeEscola, aluno.nomeEscola) && Objects.equals(serieMatriculado, aluno.serieMatriculado) && Objects.equals(disciplinas, aluno.disciplinas);
    }
  
   

//Metodo HashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai, dataMatricula, nomeEscola, serieMatriculado, disciplinas);
    }

    //Método com abstract criado na superclasse Pessoa. Tem que ser usado para todos os filhos!
    @Override
    public double salario() {
        return 1690.00;
    }
  
   

}

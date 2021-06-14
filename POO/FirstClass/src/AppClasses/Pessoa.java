package AppClasses;


//Herança - Classe Pai ou classe master ou superclasse - tem atributos comuns a todos os objetos filhos.
public abstract class Pessoa {

    //usa-se os atributos como protected para que eles sejam usados também nas classes filhas. 
    //Assim é possível acessar os atributos da super classe na classe filha.
    protected String nome;
    protected int idade;
    protected String dataNascimento;
    protected String registroGeral;
    protected String numeroCpf;
    protected String nomeMae;
    protected String nomePai;

    //método abstract que fica na classe pai ou superclasse é obrigatório para as classes filhas
    public abstract double salario();

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

    // metodo que retorna true se for 18 anos pra cima, caso contrario será falso.
    public boolean pessoaMaiorIdade() {
        return idade >=18 ;
    }


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
            "}";
    }



}

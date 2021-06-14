package AppClasses;

//Classe filha da Superclasse Pessoa
public class  Diretor extends Pessoa {

    private String registoEducacao;
    private int tempoDirecao;
    private String titulacao;


    public String getRegistoEducacao() {
        return this.registoEducacao;
    }

    public void setRegistoEducacao(String registoEducacao) {
        this.registoEducacao = registoEducacao;
    }

    public int getTempoDirecao() {
        return this.tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }



    @Override
    public String toString() {
        return "{" +
            " registoEducacao='" + getRegistoEducacao() + "'" +
            ", tempoDirecao='" + getTempoDirecao() + "'" +
            ", titulacao='" + getTitulacao() + "'" +
            "}";
    }

    @Override
    public double salario() {
       
        return 12560;
    }
   

    
}

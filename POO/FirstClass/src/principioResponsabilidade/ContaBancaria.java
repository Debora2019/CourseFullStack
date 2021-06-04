package principioResponsabilidade;

public class ContaBancaria {
    
    private String descricao;
    private double saldo = 8000;

    public void soma100Euros(){
        saldo += 100;

    }

    public void diminuir100Euros(){
        saldo -=100;
    }

    public void sacarDinheiro(double saque){
        saldo -= saque;
    }

    public void depositoDinheiro(double deposito){
        saldo += deposito;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }


    @Override
    public String toString() {
        return "{" +
            " descricao='" + getDescricao() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }





}

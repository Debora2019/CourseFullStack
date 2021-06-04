package principioResponsabilidade;

public class TesteConta {

    public static void main(String[] args) throws Exception {

        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Conta Bancária da Sra. Débora");
        System.out.println(bancaria);

        bancaria.diminuir100Euros();
        System.out.println(bancaria);

        bancaria.sacarDinheiro(400);
        System.out.println(bancaria);

        bancaria.depositoDinheiro(500);
        System.out.println(bancaria);

        bancaria.soma100Euros();
        System.out.println(bancaria);



    
}
}
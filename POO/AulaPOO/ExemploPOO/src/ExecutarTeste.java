import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) throws Exception {


        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("mouse");
        produto1.setValor(BigDecimal.valueOf(15.00));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Impressora 3D");
        produto2.setValor(BigDecimal.valueOf(3654));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Notebook");
        venda.setValorTotal(BigDecimal.valueOf(2500));
        venda.setEnderecoEntrega("por email");
        venda.setNomeCliente("Debora");
        venda.setId(220L);

        venda.getListaProduto().add(produto1);
        venda.getListaProduto().add(produto2);
        System.out.println("Descrição da venda: " + venda.getListaProduto());

        

}
}
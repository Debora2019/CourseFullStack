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

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Mesa 120x80cm");
        produto3.setValor(BigDecimal.valueOf(125.00));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Notebook");
        venda.setValorTotal(BigDecimal.valueOf(2500));
        venda.setEnderecoEntrega("por email");
        venda.setNomeCliente("Debora");
        venda.setId(220L);

        venda.getListaProduto().add(produto1);
        venda.getListaProduto().add(produto2);
        venda.getListaProduto().add(produto3);   
       

   

        System.out.println("Valor da variavel total: " + venda.getValorTotal());

}
}
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Long id;
    private String descricaoVenda;
    private String nomeCliente;
    private String enderecoEntrega;
    private BigDecimal valorTotal;
    
    private List<Produto> listaProduto = new ArrayList<Produto>();

    private double totalVenda() {
        double total = 0;
        for (Produto produto : listaProduto) {
            total += produto.getValor().doubleValue();
        }
        return total;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoVenda() {
        return this.descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return this.enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        this.valorTotal = BigDecimal.valueOf(totalVenda());
        return this.valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }


    public List<Produto> getListaProduto() {
        return this.listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descricaoVenda='" + getDescricaoVenda() + "'" +
            ", nomeCliente='" + getNomeCliente() + "'" +
            ", enderecoEntrega='" + getEnderecoEntrega() + "'" +
            ", valorTotal='" + getValorTotal() + "'" +
            ", listaProduto= + getListaProduto()" +
            " }";
    }


}

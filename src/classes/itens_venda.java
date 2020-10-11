package classes;


public class itens_venda {

    /**
     * @return the Quantidade
     */
    public int getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the clientes
     */
    public clientes getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(clientes clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the produtos
     */
    public produtos getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(produtos produtos) {
        this.produtos = produtos;
    }
    
    private int Quantidade;
    private double subtotal;
    private clientes clientes;
    private produtos produtos;
}

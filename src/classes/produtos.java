package classes;

import java.util.Date;

public class produtos {

    /**
     * @return the Estoque
     */
    public int getEstoque() {
        return Estoque;
    }

    /**
     * @param Estoque the Estoque to set
     */
    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    /**
     * @return the Cod
     */
    public int getCod() {
        return Cod;
    }

    /**
     * @param Cod the Cod to set
     */
    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    /**
     * @return the preco_venda
     */
    public double getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the preco_custo
     */
    public double getPreco_custo() {
        return preco_custo;
    }

    /**
     * @param preco_custo the preco_custo to set
     */
    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    /**
     * @return the Data
     */
    public Date getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the distribuidores
     */
    public distribuidores getDistribuidores() {
        return distribuidores;
    }

    /**
     * @param distribuidores the distribuidores to set
     */
    public void setDistribuidores(distribuidores distribuidores) {
        this.distribuidores = distribuidores;
    }
    
    
    
    private int Cod;
    private int Estoque;
    private double preco_venda;
    private double preco_custo;
    private Date Data;
    private String Descricao;
    private distribuidores distribuidores;


}

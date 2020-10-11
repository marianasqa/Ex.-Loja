package classes;

import java.util.Date;
import java.util.LinkedList;

public class vendas {

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
     * @return the itens_venda
     */
    public LinkedList getItens_venda() {
        return itens_venda;
    }

    /**
     * @param itens_venda the itens_venda to set
     */
    public void setItens_venda(LinkedList itens_venda) {
        this.itens_venda = itens_venda;
    }
    
    private int Cod;
    private Date Data;
    private clientes clientes;
    private LinkedList itens_venda;
}

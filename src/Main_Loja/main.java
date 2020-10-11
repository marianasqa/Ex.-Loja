package Main_Loja;

import classes.clientes;
import classes.distribuidores;
import classes.itens_venda;
import classes.produtos;
import classes.vendas;
import DAO.dao_clientes;
import DAO.dao_distribuidores;
import DAO.dao_itens_venda;
import DAO.dao_produtos;
import DAO.dao_vendas;
import conversor.conversor;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        /* distribuidores */
        
        distribuidores dist = new distribuidores();
        dist.setCod(98763412);
        dist.setNome_fantasia("Mercado Show");
        dist.setRazao_social("Mercado Show Brasil LTDA");
        dist.setTelefone("1139394545");
        dist.setEmail("mercadoshow2020@gmail.com");
        dao_distribuidores daoDist = new dao_distribuidores();
        daoDist.create(dist);

        /*produtos */
        
        produtos produto1 = new produtos();
        produto1.setCod(001);
        produto1.setEstoque(50);
        produto1.setPreco_venda(3.99);
        produto1.setPreco_custo(2.00);
        produto1.setData(conversor.StringParaData("02/10/2020"));
        produto1.setDescricao("Leite Integral 1 Litro");
        produto1.setDistribuidores(dist);
        dao_produtos daoProd1 = new dao_produtos();
        daoProd1.create(produto1);

        produtos produto2 = new produtos();
        produto2.setCod(002);
        produto2.setEstoque(70);
        produto2.setPreco_venda(6.37);
        produto2.setPreco_custo(3.14);
        produto2.setData(conversor.StringParaData("15/10/2020"));
        produto2.setDescricao("Leite Condensado 395g");
        produto2.setDistribuidores(dist);
        dao_produtos daoProd2 = new dao_produtos();
        daoProd2.create(produto2);

        produtos produto3 = new produtos();
        produto3.setCod(003);
        produto3.setEstoque(45);
        produto3.setPreco_venda(8.09);
        produto3.setPreco_custo(4.32);
        produto3.setData(conversor.StringParaData("29/09/2020"));
        produto3.setDescricao("Óleo Soja 900ml");
        produto3.setDistribuidores(dist);
        dao_produtos daoProd3 = new dao_produtos();
        daoProd3.create(produto3);

        produtos produto4 = new produtos();
        produto4.setCod(004);
        produto4.setEstoque(32);
        produto4.setPreco_venda(17.59);
        produto4.setPreco_custo(10.21);
        produto4.setData(conversor.StringParaData("15/11/2020"));
        produto4.setDescricao("Geléia de Framboesa Diet 230g");
        produto4.setDistribuidores(dist);
        dao_produtos daoProd4 = new dao_produtos();
        daoProd4.create(produto4);

        produtos produto5 = new produtos();
        produto5.setCod(005);
        produto5.setEstoque(27);
        produto5.setPreco_venda(30.69);
        produto5.setPreco_custo(22.79);
        produto5.setData(conversor.StringParaData("30/10/2020"));
        produto5.setDescricao("Vinho Malbec 750ml");
        produto5.setDistribuidores(dist);
        dao_produtos daoProd5 = new dao_produtos();
        daoProd5.create(produto5);

        produtos produto6 = new produtos();
        produto6.setCod(006);
        produto6.setEstoque(23);
        produto6.setPreco_venda(2.02);
        produto6.setPreco_custo(0.99);
        produto6.setData(conversor.StringParaData("10/10/2020"));
        produto6.setDescricao("Macarrão Instantaneo 85g");
        produto6.setDistribuidores(dist);
        dao_produtos daoProd6 = new dao_produtos();
        daoProd6.create(produto6);

        produtos produto7 = new produtos();
        produto7.setCod(007);
        produto7.setEstoque(11);
        produto7.setPreco_venda(8.59);
        produto7.setPreco_custo(4.80);
        produto7.setData(conversor.StringParaData("06/10/2020"));
        produto7.setDescricao("Pão de Mel Pacote 200g");
        produto7.setDistribuidores(dist);
        dao_produtos daoProd7 = new dao_produtos();
        daoProd7.create(produto7);

        produtos produto8 = new produtos();
        produto8.setCod(010);
        produto8.setEstoque(40);
        produto8.setPreco_venda(5.99);
        produto8.setPreco_custo(3.81);
        produto8.setData(conversor.StringParaData("27/10/2020"));
        produto8.setDescricao("Margarina com Sal 500g");
        produto8.setDistribuidores(dist);
        dao_produtos daoProd8 = new dao_produtos();
        daoProd8.create(produto8);

        produtos produto9 = new produtos();
        produto9.setCod(011);
        produto9.setEstoque(19);
        produto9.setPreco_venda(2.74);
        produto9.setPreco_custo(1.12);
        produto9.setData(conversor.StringParaData("30/09/2020"));
        produto9.setDescricao("Biscoito Wafer 130g");
        produto9.setDistribuidores(dist);
        dao_produtos daoProd9 = new dao_produtos();
        daoProd9.create(produto9);

        produtos produto10 = new produtos();
        produto10.setCod(012);
        produto10.setEstoque(38);
        produto10.setPreco_venda(12.09);
        produto10.setPreco_custo(7.54);
        produto10.setData(conversor.StringParaData("28/10/2020"));
        produto10.setDescricao("Caixa de Bombom 300g");
        produto10.setDistribuidores(dist);
        dao_produtos daoProd10 = new dao_produtos();
        daoProd10.create(produto10);

        /*clientes */
        
        clientes cliente1 = new clientes();
        cliente1.setCod(01);
        cliente1.setNome("Carolina Danvers");
        cliente1.setData(conversor.StringParaData("01/10/1989"));
        cliente1.setEmail("caroldanverss@icloud.com");
        cliente1.setTelefone("12998876543");
        cliente1.setEndereco("Rua Selton Silva");
        dao_clientes daoCliente1 = new dao_clientes();
        daoCliente1.create(cliente1);

        clientes cliente2 = new clientes();
        cliente2.setCod(02);
        cliente2.setNome("Elizabeth Sloane");
        cliente2.setData(conversor.StringParaData("24/03/1977"));
        cliente2.setEmail("bethsloane@gmail.com");
        cliente2.setTelefone("11988236750");
        cliente2.setEndereco("Avenida Paulista");
        dao_clientes daoCliente2 = new dao_clientes();
        daoCliente2.create(cliente2);

        clientes cliente3 = new clientes();
        cliente3.setCod(03);
        cliente3.setNome("Jessica Barrett");
        cliente3.setData(conversor.StringParaData("04/07/1990"));
        cliente3.setEmail(null);
        cliente3.setTelefone("83900664512");
        cliente3.setEndereco("Rua São João");
        dao_clientes daoCliente3 = new dao_clientes();
        daoCliente3.create(cliente3);

        clientes cliente4 = new clientes();
        cliente4.setCod(04);
        cliente4.setNome("Diana Prince");
        cliente4.setData(conversor.StringParaData("30/04/1985"));
        cliente4.setEmail("dianaprinces@outlook.com");
        cliente4.setTelefone("1956790432");
        cliente4.setEndereco("Rua Arthur Santos");
        dao_clientes daoCliente4 = new dao_clientes();
        daoCliente4.create(cliente4);

        clientes cliente5 = new clientes();
        cliente5.setCod(05);
        cliente5.setNome("Vanya Hargreeves");
        cliente5.setData(conversor.StringParaData("21/02/1987"));
        cliente5.setEmail(null);
        cliente5.setTelefone("21945128906");
        cliente5.setEndereco("Avenida Armando Costa");
        dao_clientes daoCliente5 = new dao_clientes();
        daoCliente5.create(cliente5);
        
        /* itens_venda */
        
        LinkedList l1 = new LinkedList();
        itens_venda it1 = new itens_venda();
        it1.setQuantidade(2);
        it1.setSubtotal(produto1.getPreco_venda() * it1.getQuantidade());
        it1.setClientes(cliente1);
        it1.setProdutos(produto1);
        l1.add(it1);
        
        /* vendas */
        
        vendas venda1 = new vendas();
        venda1.setCod(1);
        venda1.setData(conversor.StringParaData("12/08/2020"));
        venda1.setClientes(cliente1);
        venda1.setItens_venda(l1);
        dao_vendas daoVend1 = new dao_vendas();
        daoVend1.create(venda1);
        
        vendas venda2 = new vendas();
        venda2.setCod(2);
        venda2.setData(conversor.StringParaData("12/10/2020"));
        venda2.setClientes(cliente1);
        dao_vendas daoVend2 = new dao_vendas();
        daoVend2.create(venda2);
        
        vendas venda3 = new vendas();
        venda3.setCod(3);
        venda3.setData(conversor.StringParaData("01/02/2020"));
        venda3.setClientes(cliente2);
        dao_vendas daoVend3 = new dao_vendas();
        daoVend3.create(venda3);
        
        vendas venda4 = new vendas();
        venda4.setCod(4);
        venda4.setData(conversor.StringParaData("05/05/2019"));
        venda4.setClientes(cliente2);
        dao_vendas daoVend4 = new dao_vendas();
        daoVend4.create(venda4);
        
        vendas venda5 = new vendas();
        venda5.setCod(5);
        venda5.setData(conversor.StringParaData("25/03/2020"));
        venda5.setClientes(cliente3);
        dao_vendas daoVend5 = new dao_vendas();
        daoVend5.create(venda5);
        
        vendas venda6 = new vendas();
        venda6.setCod(6);
        venda6.setData(conversor.StringParaData("15/10/2019"));
        venda6.setClientes(cliente3);
        dao_vendas daoVend6 = new dao_vendas();
        daoVend6.create(venda6);
        
        vendas venda7 = new vendas();
        venda7.setCod(7);
        venda7.setData(conversor.StringParaData("10/10/2020"));
        venda7.setClientes(cliente4);
        dao_vendas daoVend7 = new dao_vendas();
        daoVend7.create(venda7);
        
        vendas venda8 = new vendas();
        venda8.setCod(8);
        venda8.setData(conversor.StringParaData("11/04/2020"));
        venda8.setClientes(cliente4);
        dao_vendas daoVend8 = new dao_vendas();
        daoVend8.create(venda8);
        
        vendas venda9 = new vendas();
        venda9.setCod(9);
        venda9.setData(conversor.StringParaData("09/08/2020"));
        venda9.setClientes(cliente5);
        dao_vendas daoVend9 = new dao_vendas();
        daoVend9.create(venda9);
        
        vendas venda10 = new vendas();
        venda10.setCod(1);
        venda10.setData(conversor.StringParaData("17/06/2020"));
        venda10.setClientes(cliente5);
        dao_vendas daoVend10 = new dao_vendas();
        daoVend10.create(venda10);
        
        /* chamando os metodos */
        
        dao_clientes daoCli = new dao_clientes();
        daoCli.semEmail();
        
        dao_produtos daoProd = new dao_produtos();
        daoProd.foraDaValidade();
        
        

    }
}

package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;
import classes.produtos;
import JDBC.JDBC;
import classes.clientes;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import conversor.conversor;
import java.util.Calendar;

public class dao_produtos {

    public void create(produtos prod) {

        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PRODUTOS (COD_PROD,PRECO_VENDA,DESCRICAO,DATA_VALIDADE,PRECO_CUSTO,ESTOQUE) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, prod.getCod());
            stmt.setDouble(2, prod.getPreco_venda());
            stmt.setDouble(3, prod.getPreco_custo());
            stmt.setDate(4, (Date) prod.getData());
            stmt.setString(5, prod.getDescricao());
            stmt.setInt(6, prod.getEstoque());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            JDBC.closeConnection(con, stmt);
        }

    }

    public List<produtos> Validade() {

        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<produtos> prodList = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PRODUTOS WHERE DATA_VALIDADE < (SELECT GETDATE())");
            rs = stmt.executeQuery();

            while (rs.next()) {

                produtos prod = new produtos();

                prod.setCod(rs.getInt("COD_PROD"));
                prod.setEstoque(rs.getInt("ESTOQUE"));
                prod.setPreco_venda(rs.getDouble("PRECO_VENDA"));
                prod.setPreco_custo(rs.getDouble("PRECO_CUSTO"));
                prod.setData(rs.getDate("DATA_VALIDADE"));
                prod.setDescricao(rs.getString("DESCRICAO"));

                prodList.add(prod);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta: " + ex);
        } finally {
            JDBC.closeConnection(con, stmt, rs);
        }

        return prodList;
    }

    public void foraDaValidade() {

        List<produtos> DATA_VALIDADE = Validade();
        for (produtos p : DATA_VALIDADE) {
            java.util.Date date = new java.util.Date();
            if (p.getData().before(date)) {
                System.out.println(p.getDescricao() + " " + p.getData());
            }
        }

    }

}

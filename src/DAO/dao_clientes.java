package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;
import classes.clientes;
import JDBC.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class dao_clientes {

    public void create(clientes cli) {

        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO CLIENTES (COD_CLI,NOME,NASCIMENTO,ENDERECO,TELEFONE,EMAIL) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, cli.getCod());
            stmt.setDate(2, (Date) cli.getData());
            stmt.setString(3, cli.getNome());
            stmt.setString(4, cli.getEmail());
            stmt.setString(5, cli.getTelefone());
            stmt.setString(6, cli.getEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            JDBC.closeConnection(con, stmt);
        }

    }

    public List<clientes> Clientes() {

        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<clientes> cliList = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM CLIENTES WHERE EMAIL IS NULL");
            rs = stmt.executeQuery();

            while (rs.next()) {

                clientes client = new clientes();

                client.setCod(rs.getInt("COD_CLI"));
                client.setNome(rs.getString("NOME"));
                client.setData(rs.getDate("DATA_NASC"));
                client.setEndereco(rs.getString("ENDERECO"));
                client.setTelefone(rs.getString("TELEFONE"));
                client.setEmail(rs.getString("EMAIL"));

                cliList.add(client);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta: " + ex);
        } finally {
            JDBC.closeConnection(con, stmt, rs);
        }

        return cliList;
    }

    public void semEmail() {

        List<clientes> EMAIL = Clientes();

        for (clientes c : EMAIL) {
            if (c.getEmail() == null) {
                System.out.println(c.getNome());
            }
        }
    }

}


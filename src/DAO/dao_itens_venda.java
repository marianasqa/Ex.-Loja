package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import classes.itens_venda;
import JDBC.JDBC;

public class dao_itens_venda {
    
    public void create(itens_venda it){
        
        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;
                
        try {
            stmt = con.prepareStatement("INSERT INTO DISTRIBUIDORES (QUANTIDADE,SUB_TOTAL) VALUES (?,?)");
            stmt.setInt(1,it.getQuantidade ());
            stmt.setDouble (2,it.getSubtotal ());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            JDBC.closeConnection(con, stmt);
        }
    
    }
}

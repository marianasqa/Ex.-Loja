package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import classes.distribuidores;
import JDBC.JDBC;

public class dao_distribuidores {
    
    public void create(distribuidores dist){
        
        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;
                
        try {
            stmt = con.prepareStatement("INSERT INTO DISTRIBUIDORES (COD_DIST,NOME_FANTASIA,RAZAO_SOCIAL,TELEFONE,EMAIL) VALUES (?,?,?,?,?)");
            stmt.setInt(1,dist.getCod ());
            stmt.setString(2,dist.getNome_fantasia());
            stmt.setString (3,dist.getRazao_social());
            stmt.setString(4,dist.getTelefone());
            stmt.setString(5,dist.getEmail());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            JDBC.closeConnection(con, stmt);
        }
    
}
    
}

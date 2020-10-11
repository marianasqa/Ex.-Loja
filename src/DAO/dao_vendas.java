package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;
import classes.vendas;
import JDBC.JDBC;

public class dao_vendas {
     
    public void create(vendas vend){
        
        Connection con = JDBC.getConnection();
        PreparedStatement stmt = null;
                
        try {
            stmt = con.prepareStatement("INSERT INTO VENDAS (COD_VENDAS,DATA_HORA,TOTAL) VALUES (?,?,?)");
            stmt.setInt(1,vend.getCod());
            stmt.setDate(2, (Date) vend.getData());
           
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            JDBC.closeConnection(con, stmt);
        }
    }
    }
    


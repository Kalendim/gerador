/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Contato;
import persistencia.ConexaoBanco;

/**
 *
 * @author Thiago Hofmeister
 * @since 05/05/2015
 * @version 1.0 The Legend
 */
public class ContatoDAO {
    
    public long cadastrarContato(Contato c) throws SQLException{        
       Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql ="";
            
          
            sql = "insert into contato(idcontato,celular,telefone,email)"
                       + "values(null,?,?,?)";

            pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            pstmt.setInt(1, Integer.parseInt(c.getCelular()));
            pstmt.setInt(2, Integer.parseInt(c.getTelefone()));
            pstmt.setString(3, c.getEmail());
            pstmt.execute();
            
            ResultSet rs = pstmt.getGeneratedKeys();
            long chaveGerada = 0;
            
            if (rs != null && rs.next()) {
                chaveGerada = rs.getLong(1);
            }
            return chaveGerada;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar! " + se.getMessage());
        }finally{
            con.close();
            pstmt.close();
        }
    }//fecha cadastrarCliente
}

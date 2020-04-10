
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Endereco;
import persistencia.ConexaoBanco;


public class EnderecoDAO {
    
    public long cadastrarEndereco(Endereco c) throws SQLException{
        
      
        
       Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql ="";
            
          
            sql = "insert into endereco(idendereco,cidade,bairro,rua,numerocasa,cep)"
                       + "values(null,?,?,?,?,?)";

            pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            pstmt.setString(1, c.getCidade());
            pstmt.setString(2, c.getBairro());
            pstmt.setString(3, c.getRua());
            pstmt.setInt(4, c.getNumeroCasa());
            pstmt.setString(5, c.getCep());
           
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


package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import persistencia.ConexaoBanco;
import modelo.Turma;

public class TurmaDAO {
    public void cadastrar(Turma t) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
        try {
            String sql = "INSERT INTO turma(idturma,anoletivo,ensino,turno,datadeinicio,periodo,numero)"
                       + "values(null,?,?,?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, t.getAnoLetivo());
            pstmt.setString(2, t.getEnsino());
             pstmt.setString(3, t.getTurno());
            pstmt.setDate(4, Date.valueOf(t.getDataDeInicio()));
             pstmt.setInt(5, t.getPeridos());
             pstmt.setInt(6, t.getNumero());
           
            pstmt.execute();
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        }finally{
            stat.close();
            conn.close();
        }
    }
    
    public ArrayList<Turma> buscarTurma(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from "+query;
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<Turma> turma = new ArrayList<>();
            
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
                
            while (rs.next()) {
                Turma tVO = new Turma();
                tVO.setIdTurma(rs.getInt("idturma"));
                tVO.setTurno(rs.getString("turno"));
                tVO.setAnoLetivo(rs.getString("anoletivo"));
                
                //tVO.setDataDeInicio(LocalDate.parse(rs.getString("datadeinicio"), formatter));
                
                tVO.setPeridos(rs.getInt("periodo"));
                tVO.setNumero(rs.getInt("numero"));
                
                turma.add(tVO);
            }
            
            return turma;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}

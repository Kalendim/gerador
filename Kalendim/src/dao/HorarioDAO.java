
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.Contato;
import modelo.Endereco;
import persistencia.ConexaoBanco;
import modelo.Professor;
import modelo.Horario;
import modelo.Materia;
import modelo.Turma;

public class HorarioDAO {
    public void cadastrar(Horario h) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
         try {
            
            String sql = "insert into horario(idmateria,idturma,dia,numero,tempo,idHorario)"
                       + "values(?,?,?,?,?,null)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, h.getMateria().getIdmateria());
            pstmt.setInt(2, h.getTurma().getIdTurma());
            pstmt.setInt(3, h.getDia());
            pstmt.setInt(4, h.getNumeroPeriodo());
            pstmt.setInt(5, h.getTempo());
           
            pstmt.execute();
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        }finally{
            stat.close();
            conn.close();
        }
    }
    public void deletar() throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
         try {
            
            String sql = "delete from horario";
            
            stat.execute(sql);
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        }finally{
            stat.close();
            conn.close();
        }
    }
    public ArrayList<Horario> buscarHorario(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "select *, t.numero as numeroturma from " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Horario> horario = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            while (rs.next()) {
                Horario h = new Horario();
                
                h.setIdHorario(rs.getInt("idhorario"));
                h.setDia(rs.getInt("dia"));
                h.setNumeroPeriodo(rs.getInt("numero"));
                h.setTempo(rs.getInt("tempo"));
                
                Materia materia = new Materia();
                
                materia.setIdmateria(rs.getInt("idmateria"));
                materia.setNome(rs.getString("nome"));
                
                h.setMateria(materia);
                
                Turma turma = new Turma();
                
                turma.setIdTurma(rs.getInt("idturma"));
                turma.setTurno(rs.getString("turno"));
                turma.setAnoLetivo(rs.getString("anoletivo"));
                //tVO.setDataDeInicio(LocalDate.parse(rs.getString("datadeinicio"), formatter));
                turma.setPeridos(rs.getInt("periodo"));
                turma.setNumero(rs.getInt("numeroturma"));
                
                h.setTurma(turma);
                
                horario.add(h);
            }
            return horario;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}

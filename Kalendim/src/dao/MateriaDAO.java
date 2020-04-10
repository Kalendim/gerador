
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
import modelo.Materia;

public class MateriaDAO {
    public void cadastrar(Materia m) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
         try {
            
            String sql = "insert into materia(nome,idprofessor,idmateria)"
                       + "values(?,?,null)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, m.getNome());
            pstmt.setInt(2, m.getProfessor().getIdProfessor());
           
            pstmt.execute();
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        }finally{
            stat.close();
            conn.close();
        }
    }
    public ArrayList<Materia> buscarMateria(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "select * " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Materia> materia = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            while (rs.next()) {
                Materia mate = new Materia();
                
                mate.setIdmateria(rs.getInt("idmateria"));
                mate.setNome(rs.getString("nomemateria"));
                
                
                //busca o professor
                //ArrayList<Professor> professor = new ArrayList<>();
                //ProfessorDAO pDAO = new ProfessorDAO();
                //professor = pDAO.buscarProfessor("professor where idprofessor = " + rs.getInt("idprofessor"));
            

                Professor professor = new Professor();

                professor.setIdProfessor(rs.getInt("idprofessor"));
                professor.setNome(rs.getString("nome"));
                professor.setSexo(rs.getString("sexo"));
//                professor.setNascionalidade(rs.getString("nacionalidade"));
                professor.setDisciplinas(rs.getString("disciplinas"));
                
                mate.setProfessor(professor);
                materia.add(mate);
            }
            return materia;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}

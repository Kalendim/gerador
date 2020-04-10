
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
import modelo.Turma;

public class ProfessorDAO {
    public void cadastrar(Professor p) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
         try {
            //cadastra o endereço
            EnderecoDAO eDAO = new EnderecoDAO();
            long idEndereco = eDAO.cadastrarEndereco(p.getEndereco());
            //cadastra o contato
            ContatoDAO cDAO = new ContatoDAO();
            long idContato = cDAO.cadastrarContato(p.getContato());
            
            String sql ="";
            
            sql = "insert into professor(nome,sexo,nacionalidade,datanascimento,disciplinas,idendereco,idcontato,idprofessor)"
                       + "values(?,?,?,?,?,?,?,null)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, p.getNome());
            pstmt.setString(2, p.getSexo());
             pstmt.setString(3, p.getNascionalidade());
            pstmt.setDate(4, Date.valueOf(p.getDataNascimento()));
           pstmt.setString(5, p.getDisciplinas());
            pstmt.setLong(6, idEndereco);
            pstmt.setLong(7, idContato);
           
            pstmt.execute();
            
        } catch (SQLException e) {
            
            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        }finally{
            stat.close();
            conn.close();
        }
    }
    public ArrayList<Professor> buscarProfessor(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "select *, p.nome as nomeprofessor from " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Professor> professor = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            while (rs.next()) {
                Professor aVO = new Professor();

                aVO.setIdProfessor(rs.getInt("idprofessor"));
                aVO.setNome(rs.getString("nomeprofessor"));
                aVO.setSexo(rs.getString("sexo"));
                aVO.setNascionalidade(rs.getString("nacionalidade"));
                aVO.setDisciplinas(rs.getString("disciplinas"));

                //aVO.setDataDeInicio(LocalDate.parse(rs.getString("datadeinicio"), formatter));
                
                Endereco endereco = new Endereco();

                endereco.setIdEndereco(rs.getInt("idendereco"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumeroCasa(rs.getInt("numerocasa"));
                endereco.setCep(rs.getString("cep"));
                
                Contato contato = new Contato();

                contato.setIdContato(rs.getInt("idcontato"));
                contato.setCelular(rs.getString("celular"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));
                
                Turma turma = new Turma();
                /*if(rs.getString("idturma") != null){

                turma.setIdTurma(rs.getInt("idturma"));
                turma.setTurno(rs.getString("turno"));
                turma.setEnsino(rs.getString("ensino"));
                turma.setAnoLetivo(rs.getString("anoletivo"));
                //turma.setDataDeInicio(rs.getString("datadeinicio"));
                turma.setPeridos(rs.getInt("periodo"));
                turma.setNumero(rs.getInt("numero"));
                }*/
                
                aVO.setEndereco(endereco);
                aVO.setContato(contato);
                //aVO.setTurma(turma);
                
                professor.add(aVO);
            }
            return professor;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}

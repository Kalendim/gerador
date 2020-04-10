/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import persistencia.ConexaoBanco;
import modelo.Aluno;
import modelo.Contato;
import modelo.Endereco;
import modelo.Turma;

/**
 *
 * @author Matheus LK Arthur Bolsoni
 * @since 4/07/2017 - 16:00
 * @version 1.5 Beta maisamornocoraçãothiago
 */
public class AlunoDAO {

    public void cadastrar(Aluno a) throws SQLException {
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();

        try {
            //cadastra o endereço
            EnderecoDAO eDAO = new EnderecoDAO();
            long idEndereco = eDAO.cadastrarEndereco(a.getEndereco());
            //cadastra o contato
            ContatoDAO cDAO = new ContatoDAO();
            long idContato = cDAO.cadastrarContato(a.getContato());

            String sql = "";

            System.out.println(idContato);
            sql = "insert into aluno(nome,sexo,nacionalidade,datanascimento,cor,classesocial,idendereco,idcontato,idaluno)"
                    + "values(?,?,?,?,?,?,?,?,null)";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, a.getNome());
            pstmt.setString(2, a.getSexo());
            pstmt.setString(3, a.getNascionalidade());
            pstmt.setDate(4, Date.valueOf(a.getDataNascimento()));
            pstmt.setString(5, a.getCor());
            pstmt.setString(6, a.getClasseSocial());
            pstmt.setLong(7, idEndereco);
            pstmt.setLong(8, idContato);

            pstmt.execute();

        } catch (SQLException e) {

            throw new SQLException("Erro ao cadastrar no banco! " + e.getMessage());
        } finally {
            stat.close();
            conn.close();
        }
    }

    public ArrayList<Aluno> buscarAluno(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "select * from " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Aluno> aluno = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            while (rs.next()) {
                Aluno aVO = new Aluno();

                aVO.setIdAluno(rs.getInt("idaluno"));
                aVO.setNome(rs.getString("nome"));
                aVO.setCor(rs.getString("cor"));
                aVO.setSexo(rs.getString("sexo"));
                aVO.setClasseSocial(rs.getString("classesocial"));
                aVO.setNascionalidade(rs.getString("nacionalidade"));

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
                    turma.setIdTurma(rs.getInt("idturma"));
                    turma.setTurno(rs.getString("turno"));
                    turma.setEnsino(rs.getString("ensino"));
                    turma.setAnoLetivo(rs.getString("anoletivo"));
                    //turma.setDataDeInicio(rs.getString("datadeinicio"));
                    turma.setPeridos(rs.getInt("periodo"));
                    turma.setNumero(rs.getInt("numero"));
                    aVO.setTurma(turma);

                aVO.setEndereco(endereco);
                aVO.setContato(contato);

                aluno.add(aVO);
            }
            return aluno;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public ArrayList<Aluno> buscarAlunoSemTurma(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "select * from " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Aluno> aluno = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            while (rs.next()) {
                Aluno aVO = new Aluno();

                aVO.setIdAluno(rs.getInt("idaluno"));
                aVO.setNome(rs.getString("nome"));
                aVO.setCor(rs.getString("cor"));
                aVO.setSexo(rs.getString("sexo"));
                aVO.setClasseSocial(rs.getString("classesocial"));
                aVO.setNascionalidade(rs.getString("nacionalidade"));

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

                aVO.setEndereco(endereco);
                aVO.setContato(contato);

                aluno.add(aVO);
            }
            return aluno;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public void alterarAluno(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "update " + query;

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}


package servicos;

import dao.DAOFactory;
import dao.AlunoDAO;
import dao.TurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.Turma;


public class AlunoServicos {
    public void cadastrar(Aluno a) throws SQLException{
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.cadastrar(a);
    }

    public ArrayList<Aluno> buscarAluno(String query) throws SQLException {
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        return aDAO.buscarAluno(query);
    }

    public ArrayList<Aluno> buscarAlunoSemTurma(String query) throws SQLException {
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        return aDAO.buscarAlunoSemTurma(query);
    }

    public void AlterarAluno(String query) throws SQLException {
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.alterarAluno(query);
    }
}

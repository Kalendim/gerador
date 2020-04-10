
package servicos;

import dao.DAOFactory;
import dao.TurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Turma;

public class TurmaServicos {
    public void cadastrar(Turma t) throws SQLException{
        TurmaDAO aDAO = DAOFactory.getTurmaDAO();
        aDAO.cadastrar(t);
    }

    public ArrayList<Turma> buscarTurmas(String query) throws SQLException {
        TurmaDAO tDAO = DAOFactory.getTurmaDAO();
        return tDAO.buscarTurma(query);
    }
}

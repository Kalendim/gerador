
package servicos;

import dao.DAOFactory;
import dao.MateriaDAO;
import dao.TurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Materia;
import modelo.Turma;


public class MateriaServicos {
    public void cadastrar(Materia m) throws SQLException{
        MateriaDAO aDAO = DAOFactory.getMateriaDAO();
        aDAO.cadastrar(m);
    }

    public ArrayList<Materia> buscarMaterias(String query) throws SQLException {
        MateriaDAO tDAO = DAOFactory.getMateriaDAO();
        return tDAO.buscarMateria(query);
    }
}

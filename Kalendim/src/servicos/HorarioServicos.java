
package servicos;

import dao.DAOFactory;
import dao.HorarioDAO;
import dao.MateriaDAO;
import dao.TurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Materia;
import modelo.Horario;

public class HorarioServicos {
    public void cadastrar(Horario h) throws SQLException{
        HorarioDAO aDAO = DAOFactory.getHorarioDAO();
        aDAO.cadastrar(h);
    }
    public void deletar() throws SQLException{
        HorarioDAO aDAO = DAOFactory.getHorarioDAO();
        aDAO.deletar();
    }

    public ArrayList<Horario> buscarHorario(String query) throws SQLException {
        HorarioDAO tDAO = DAOFactory.getHorarioDAO();
        return tDAO.buscarHorario(query);
    }
}

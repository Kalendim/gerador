/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ProfessorDAO;
import dao.TurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Professor;
import modelo.Turma;

/**
 * 
 * @author Matheus LK Arthur Bolsoni
 * @since 4/07/2017 - 16:00
 * @version 1.5 Beta maisamornocoraçãothiago
 */
public class ProfessorServicos {
    public void cadastrar(Professor a) throws SQLException{
        ProfessorDAO aDAO = DAOFactory.getProfessorDAO();
        aDAO.cadastrar(a);
    }

    public ArrayList<Professor> buscarProfessor(String query) throws SQLException {
        ProfessorDAO tDAO = DAOFactory.getProfessorDAO();
        return tDAO.buscarProfessor(query);
    }
}

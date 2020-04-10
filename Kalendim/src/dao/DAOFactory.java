/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * 
 * @author Matheus LK Arthur Bolsoni
 * @since 4/07/2017 - 16:00
 * @version 1.5 Beta maisamornocoraçãothiago
 */
public class DAOFactory {
    public static AlunoDAO aDAO = new AlunoDAO();
    public static ProfessorDAO pDAO = new ProfessorDAO();
    public static TurmaDAO tDAO = new TurmaDAO();
    public static EnderecoDAO eDAO = new EnderecoDAO();
    public static MateriaDAO mDAO = new MateriaDAO();
    public static HorarioDAO hDAO = new HorarioDAO();

    public static AlunoDAO getAlunoDAO() {
        return aDAO;
    }
    
    public static ProfessorDAO getProfessorDAO() {
        return pDAO;
    }
    public static TurmaDAO getTurmaDAO() {
        return tDAO;
    }
    public static EnderecoDAO getEnderecoDAO() {
        return eDAO;
    }
    public static MateriaDAO getMateriaDAO() {
        return mDAO;
    }
    public static HorarioDAO getHorarioDAO() {
        return hDAO;
    }
}

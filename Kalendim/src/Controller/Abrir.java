
package Controller;

import modelo.Aluno;
import modelo.Professor;
import visao.UIConfigAluno;
import visao.UIConfigProfessor;
import visao.UISelecionarAluno;
import visao.UISelecionarProfessor;


public class Abrir {

    public static void abrirprofessor(Professor professor) {
        if (professor == null) {
            UISelecionarProfessor p = new UISelecionarProfessor(null, true);
            p.setVisible(true);
        } else {
            UIConfigProfessor p = new UIConfigProfessor(null, true, professor);
            p.setVisible(true);
        }
    }

    public static void abrirAluno(Aluno aluno){
        if (aluno == null) {
            UISelecionarAluno p = new UISelecionarAluno(null, true);
            p.setVisible(true);
        } else {
            UIConfigAluno p = new UIConfigAluno(null, true, aluno);
            p.setVisible(true);
        }
    }
}

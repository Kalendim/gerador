
package servicos;


public class ServicoFactory {
   
    public static final AlunoServicos a = new AlunoServicos();
    public static final ProfessorServicos p = new ProfessorServicos();
    public static final TurmaServicos t = new TurmaServicos();
    public static final MateriaServicos m = new MateriaServicos();
    public static final HorarioServicos h = new HorarioServicos();

    public static AlunoServicos getAluno() {
        return a;
    }
    public static ProfessorServicos getProfessor() {
        return p;
    }
    public static TurmaServicos getTurma() {
        return t;
    }
    public static MateriaServicos getMateria() {
        return m;
    }
    public static HorarioServicos getHorario() {
        return h;
    }
}


package modelo;

import java.time.LocalDate;
import java.util.Date;


public class Horario {
    public int numeroPeriodo;
    public int idHorario;
    public int dia;
    public int tempo;
    private Turma turma;
    private Materia materia;

    public Horario(int numeroPeriodo, int idHorario, int dia, int tempo, Turma turma, Materia materia) {
        this.numeroPeriodo = numeroPeriodo;
        this.idHorario = idHorario;
        this.dia = dia;
        this.tempo = tempo;
        this.turma = turma;
        this.materia = materia;
    }

    public Horario() {
    }
    
    public int getNumeroPeriodo() {
        return numeroPeriodo;
    }

    public void setNumeroPeriodo(int numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    @Override
    public String toString() {
        return materia.nome;
    }
}

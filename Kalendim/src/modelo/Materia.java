
package modelo;

import java.time.LocalDate;
import java.util.Date;


public class Materia {
    public String nome;
    private Professor professor;
    private int idmateria;

    public Materia() {
    }
    
    public Materia(String nome, Professor professor, int idmateria) {
        this.nome = nome;
        this.professor = professor;
        this.idmateria = idmateria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}

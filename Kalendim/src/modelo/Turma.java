
package modelo;

import java.time.LocalDate;
import java.util.Date;


public class Turma {
    public String Turno;
    public int numero;
    public int peridos;
    public int idTurma;
    public String ensino;
    public String anoLetivo;
    public LocalDate dataDeInicio;
    public String ano; // nao utilizat
    /*
    //Metodos a serem criados
    public double media;
    public int numeroDeAlunos;
    public int numeroDeProfessores;
    public int peridosSobrando;
    public int peridosFaltando;
    */

    public Turma() {
    }

    public Turma(String Turno, int numero, int peridos, String ensino, String anoLetivo, LocalDate dataDeInicio, String ano) {
        this.Turno = Turno;
        this.numero = numero;
        this.peridos = peridos;
        this.ensino = ensino;
        this.anoLetivo = anoLetivo;
        this.dataDeInicio = dataDeInicio;
        this.ano = ano;
    }
    
    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeridos() {
        return peridos;
    }

    public void setPeridos(int peridos) {
        this.peridos = peridos;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    
    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}


package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Aluno {
    public String nome;
    public String sexo;
    public String cor;
    public String classeSocial;
    public String nascionalidade;
    public String cidadeOrigem;
    public LocalDate dataNascimento;
    public Turma turma;
    private Endereco endereco;
    private Contato contato;
    public int idAluno;
    public String rg;

    public Aluno(String nome, String sexo, String cor, String classeSocial, String Nascionalidade, LocalDate dataNascimento, Turma turma, Endereco endereco, Contato contato, int idAluno) {
        this.nome = nome;
        this.sexo = sexo;
        this.cor = cor;
        this.classeSocial = classeSocial;
        this.nascionalidade = Nascionalidade;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.endereco = endereco;
        this.contato = contato;
        this.idAluno = idAluno;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getClasseSocial() {
        return classeSocial;
    }

    public void setClasseSocial(String classeSocial) {
        this.classeSocial = classeSocial;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getIdTurma() {
        return turma;
    }

    public void setIdTurma(Turma turma) {
        this.turma = turma;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}

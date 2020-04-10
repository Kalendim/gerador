
package modelo;

import java.time.LocalDate;


public class Professor {
    public String nome;
    public String sexo;
    public String nascionalidade;
    public LocalDate dataNascimento;
    public String disciplinas;
    public String cpf;
    public String rg;
    public boolean direcao;
    private Endereco endereco;
    private Contato contato;
    public int idProfessor;
    
    public Professor() {
    }

    public Professor(String nome, String sexo, String nascionalidade, LocalDate dataNascimento, String disciplinas, String cpf, String rg, boolean direcao, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascionalidade = nascionalidade;
        this.dataNascimento = dataNascimento;
        this.disciplinas = disciplinas;
        this.cpf = cpf;
        this.rg = rg;
        this.direcao = direcao;
        this.endereco = endereco;
        this.contato = contato;
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

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
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

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return nome;
    }
}

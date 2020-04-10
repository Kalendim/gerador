
package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Endereco {
    public String cidade;
    public String bairro;
    public int numeroCasa;
    public String cep;
    public String rua;
    public int idEndereco;

    public Endereco() {
    }

    public Endereco(String cidade, String bairro, int numeroCasa, String cep, String rua, int idEndereco) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.rua = rua;
        this.idEndereco = idEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    
    @Override
    public String toString() {
        return "Endereco{" + "cidade=" + cidade + ", bairro=" + bairro + ", numeroCasa=" + numeroCasa + ", cep=" + cep + ", rua=" + rua + '}';
    }
}
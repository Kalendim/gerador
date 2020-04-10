
package modelo;

import java.time.LocalDate;
import java.util.Date;


public class Contato {
    public String celular;
    public String telefone;
    public String email;
    public int idContato;
    
    public Contato() {
    }

    public Contato(String celular, String telefone, String email, int idContato) {
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.idContato = idContato;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }
    
    @Override
    public String toString() {
        return "Contato{" + "celular=" + celular + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}

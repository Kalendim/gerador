
package servicos;

import dao.EnderecoDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.Endereco;

public class EnderecoServicos {
    public void cadastrarEndereco(Endereco e) throws SQLException{
        EnderecoDAO cDAO = DAOFactory.getEnderecoDAO();
        cDAO.cadastrarEndereco(e);
    }
}

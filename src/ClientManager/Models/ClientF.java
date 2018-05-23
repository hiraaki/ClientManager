package ClientManager.Models;

import java.util.Objects;

/**Classe que estende a classe cliente
 *
 */
public class ClientF  extends  Client{
    private String Cpf;

    /**
     * Construtor da classe cliente pessoa física
     * @param name Armazena nome do cliente
     * @param cpf Armazena o cpf do cliente
     */
    public ClientF(String name, String cpf) {
        super(name);
        Cpf = cpf;
    }



    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(this.getName()+ this.Cpf);
    }
}

package ClientManager.Models;

/**
 * Classe que estende a classe cliente
 */
public class ClientJ extends Client {
    private String Cnpj;

    /**
     * Esse é o construtor da classe cliente pessoa Jurídica
     * @param name armazena o nome da empresa
     * @param cnpj armazena o cnpj da empresa
     */
    public ClientJ(String name, String cnpj) {
        super(name);
        Cnpj = cnpj;
    }

    public String getCnpj() {
        return Cnpj;
    }


    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }
}

package ClientManager.Models;

public class ClientJ extends Client {
    private String Cnpj;

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

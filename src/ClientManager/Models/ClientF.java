package ClientManager.Models;

public class ClientF  extends  Client{
    private String Cpf;

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
}

package ClientManager.Models;

import java.util.Objects;

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
    @Override
    public int hashCode(){
        return Objects.hashCode(this.getName()+ this.Cpf);
    }
}

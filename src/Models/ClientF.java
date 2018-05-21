package Models;

public class ClientF  extends  Client{
    private String Cpf;

    public ClientF(String name, float spent, float debit, float winnings, String cpf) {
        super(name, spent, debit, winnings);
        Cpf = cpf;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
}

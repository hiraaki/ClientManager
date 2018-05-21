package Models;

public class ClientJ extends Client {
    private String Cnpj;

    public ClientJ(String name, float spent, float debit, float winnings, String cnpj) {
        super(name, spent, debit, winnings);
        Cnpj = cnpj;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }
}

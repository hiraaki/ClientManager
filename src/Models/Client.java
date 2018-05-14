package Models;

public class Client {
    private int id;
    private String name;
    private float spent;
    private float debit;
    private  float winnings;

    public Client(String name, float spent, float debit, float winnings) {
        this.name = name;
        this.spent = spent;
        this.debit = debit;
        this.winnings = winnings;
    }

}

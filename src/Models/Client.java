package Models;

public class Client {
    private int id;
    private String name;
    private float spent;
    private float debit;
    private  float winnings;

    public Client(String name) {
        this.spent=0;
        this.debit=0;
        this.winnings=0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpent() {
        return spent;
    }

    public void setSpent(float spent) {
        this.spent = spent;
    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public float getWinnings() {
        return winnings;
    }

    public void setWinnings(float winnings) {
        this.winnings = winnings;
    }
}

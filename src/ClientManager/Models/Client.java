package ClientManager.Models;

import java.util.ArrayList;

public class Client {
    private int code;
    private String name;
    private float spent;
    private float debit;
    private  float winnings;
    private ArrayList<Invoice> services;

    public Client(String name) {
        this.spent=0;
        this.debit=0;
        this.winnings=0;
        this.name = name;
        this.services=new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public ArrayList<Invoice> getServices() {
        return services;
    }

    public void setServices(ArrayList<Invoice> services) {
        this.services = services;
    }
}

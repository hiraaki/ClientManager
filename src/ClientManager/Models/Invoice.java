package ClientManager.Models;


public class Invoice {
    private int id;
    private int clientID;
    private String description;
    private Client client;
    private float spent;
    private float totalcost;

    public Invoice(int clientID, String description, Client client, float spent, float totalcost) {
        this.clientID = clientID;
        this.description = description;
        this.client = client;
        this.spent = spent;
        this.totalcost = totalcost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getSpent() {
        return spent;
    }

    public void setSpent(float spent) {
        this.spent = spent;
    }

    public float getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(float totalcost) {
        this.totalcost = totalcost;
    }
}

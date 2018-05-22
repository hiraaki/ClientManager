package ClientManager.Models;


public class Invoice {
    private int id;
    private int clientID;
    private String description;
    private Client client;
    public Invoice(int clientID, String description) {
        this.clientID = clientID;
        this.description = description;
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
}

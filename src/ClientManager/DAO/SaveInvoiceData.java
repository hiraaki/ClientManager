package ClientManager.DAO;

import ClientManager.Models.Client;
import ClientManager.Models.ClientF;
import ClientManager.Models.ClientJ;
import ClientManager.Models.Invoice;

import java.util.ArrayList;

public class SaveInvoiceData {

    ArrayList<Invoice> invoices;
    SaveClientData client;

    public SaveInvoiceData(ArrayList<Invoice> invoices, SaveClientData client) {
        this.invoices = invoices;
        this.client = client;
    }

    public void addInvoice(Client client, Invoice invoice){
        invoice.setClientID(client.getCode());
        this.invoices.add(invoice);
        client.getServices().add(invoice);
    }
    public void delete(Invoice in){
        int n = in.getClient().getCode();
        Client c;
        for(ClientF cli: client.ClientesF){
            if(cli.getCode()==n){
                cli.getServices().remove(in);
            }
        }
        for(ClientJ cli: client.ClientesJ){
            if(cli.getCode()==n){
                cli.getServices().remove(in);
            }
        }
    }

}

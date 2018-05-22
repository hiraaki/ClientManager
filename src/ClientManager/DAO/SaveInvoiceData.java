package ClientManager.DAO;

import ClientManager.Models.Client;
import ClientManager.Models.Invoice;

import java.util.ArrayList;

public class SaveInvoiceData {
    ArrayList<Invoice> invoices;
    public SaveInvoiceData (){
        this.invoices=new ArrayList<>();
    }
    public void addInvoice(Client client,Invoice invoice){
        invoice.setClientID(client.getCode());
        this.invoices.add(invoice);
        client.getServices().add(invoice);
    }

}

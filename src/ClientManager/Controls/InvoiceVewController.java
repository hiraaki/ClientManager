package ClientManager.Controls;

import ClientManager.DAO.SaveInvoiceData;
import ClientManager.Models.Client;
import ClientManager.Models.Invoice;

import java.util.ArrayList;

public class InvoiceVewController {
    SaveInvoiceData InvoiceData;

    public InvoiceVewController(SaveInvoiceData invoiceData) {
        InvoiceData = invoiceData;
    }

    public void registerInvoiceF(int clientID, String description, Client client, float spent, float totalcost ){
        InvoiceData.addInvoice(client,new Invoice(clientID, description, client, spent, totalcost) );
    }
    public void registerInvoiceJ(Invoice in){
        InvoiceData.delete(in);
    }
}

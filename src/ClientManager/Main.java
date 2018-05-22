package ClientManager;

import ClientManager.Controls.ClientViewController;
import ClientManager.Controls.InvoiceVewController;
import ClientManager.DAO.SaveClientData;
import ClientManager.DAO.SaveInvoiceData;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SaveClientData ClientData = new SaveClientData();
        SaveInvoiceData InvoiceData = new SaveInvoiceData(ClientData);
        ClientViewController ClientController = new ClientViewController(ClientData);
        InvoiceVewController InvoiceController = new InvoiceVewController();
        ClientController.registerClientJ("Putão","Putão Ltda");
        ClientController.registerClientF("Putão","Putão cpf");


    }
}

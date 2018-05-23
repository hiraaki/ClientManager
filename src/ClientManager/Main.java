package ClientManager;

import ClientManager.Controls.ClientViewController;
import ClientManager.Controls.InvoiceVewController;
import ClientManager.DAO.SaveClientData;
import ClientManager.DAO.SaveInvoiceData;
import ClientManager.Models.ClientF;
import ClientManager.Models.ClientJ;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SaveClientData ClientData = new SaveClientData();
        SaveInvoiceData InvoiceData = new SaveInvoiceData(ClientData);
        ClientViewController ClientController = new ClientViewController(ClientData);
        InvoiceVewController InvoiceController = new InvoiceVewController(InvoiceData);
        ClientController.registerClientJ("Putão","Putão Ltda");
        ClientController.registerClientF("Putão","Putão cpf");
        ClientJ J = (ClientJ) ClientData.getClient(Objects.hashCode("Putão"+"Putão Ltda"));
        System.out.println(J.hashCode());
        ClientF F = (ClientF) ClientData.getClient(Objects.hashCode("Putão"+"Putão cpf"));
        System.out.println(F.hashCode());


    }
}

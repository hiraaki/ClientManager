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
        ClientController.registerClientJ("Plutão","37.664.060/0001-19");
        ClientController.registerClientF("Rodrigo Batata","410.858.110-50");
        ClientJ J = (ClientJ) ClientData.getClient(Objects.hashCode("Plutão"+"37.664.060/0001-19"));
        System.out.println(J.hashCode());
        ClientF F = (ClientF) ClientData.getClient(Objects.hashCode("Rodrigo Batata"+"410.858.110-50"));
        System.out.println(F.hashCode());
        ClientData.deleteClientF(F);
        ClientData.deleteClientJ(J);


    }
}

package ClientManager.Controls;

import ClientManager.DAO.SaveClientData;
import ClientManager.Models.ClientF;
import ClientManager.Models.ClientJ;

public class ClientViewController {
    SaveClientData data;

    public ClientViewController(SaveClientData data) {
        this.data = data;
    }
    public void registerClientJ(String _name, String cnpj){
        data.saveClientJ(new ClientJ(_name,cnpj));
    }
    public void  DeleteClientJ(String _name, String cnpj){
        data.deleteClientJ(new ClientJ(_name,cnpj));
    }
    public void registerClientF(String _name, String cpf){
        data.saveClientF(new ClientF(_name,cpf));
    }
    public void  DeleteClientF(String _name, String cpf){
        data.deleteClientF(new ClientF(_name,cpf));
    }

}

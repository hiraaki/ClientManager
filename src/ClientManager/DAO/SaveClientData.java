package ClientManager.DAO;

import ClientManager.Models.ClientF;
import ClientManager.Models.ClientJ;

import java.util.ArrayList;

public class SaveClientData {
    ArrayList<ClientF> ClientesF;
    ArrayList<ClientJ> ClientesJ;

    public SaveClientData(){
        this.ClientesJ=new ArrayList<>();
        this.ClientesF=new ArrayList<>();
    }
    public void saveClientF(ClientF f){
        f.setCode(f.hashCode());
        this.ClientesF.add(f);
    }
    public void saveClientJ(ClientJ J){
        this.ClientesJ.add(J);
    }

    public void deleteClientF(ClientF F){
        this.ClientesF.remove(F);
    }

    public void deleteClientJ(ClientJ J){
        this.ClientesJ.remove(J);
    }
}

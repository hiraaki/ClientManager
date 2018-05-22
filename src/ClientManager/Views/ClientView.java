package ClientManager.Views;

import ClientManager.Models.ClientF;
import ClientManager.Models.ClientJ;

import java.util.Scanner;

public class ClientView {
    public static Scanner entrada = new Scanner(System.in);
    public Object  addClient(){
        System.out.println("Qual o tipo de cliente:\n\t(1)Pessoa Fisica\n\t(2):Pessoa Juridica\nOpção escolhida:");
        int op = entrada.nextInt();
        if(op==1){
            System.out.println("Digite o Nome do Cliente:");
             String name;
             name= entrada.nextLine();
            System.out.println("Digite o CPF do Cliente:");
            String cpf= entrada.nextLine();

            return (new ClientF(name,cpf));
        }else if(op==2){
            System.out.println("Digite o nome da Empresa:");
            String name;
            name= entrada.nextLine();
            System.out.println("Digite o CNPJ do Cliente:");
            String cnpj= entrada.nextLine();

            return (new ClientJ(name,cnpj));
        }else{
            return null;
        }


    }
    public void delClient(){

    }
    public void totalSpent(){

    }
    public void Debit(){

    }
}

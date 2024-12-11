package controller;
import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BancoController {
    public static void main(String[] args) {
        //1.c
        ContaPoupanca cp1 = new ContaPoupanca(1000);
        ContaPoupanca cp2 = new ContaPoupanca(2000);
        ContaPoupanca cp3 = new ContaPoupanca(3000);

        ContaCorrente cc1 = new ContaCorrente(1000,2);
        ContaCorrente cc2 = new ContaCorrente(2000,3);
        ContaCorrente cc3 = new ContaCorrente(3000,4);

        Cliente cliente1 = new Cliente("João", 7);
        Cliente cliente2 = new Cliente("Maria", 8);
        Cliente cliente3 = new Cliente("José", 9);

        System.out.println(cp1+"\n"+cp2+"\n"+cp3+"\n"+cc1+"\n"+cc2+"\n"+cc3+"\n"+cliente1+"\n"+cliente2+"\n"+cliente3);

        //1.d
        List<Conta> contasList = new ArrayList<>();
        contasList.add(cp1);
        contasList.add(cp2);
        contasList.add(cp3);
        contasList.add(cc1);
        contasList.add(cc2);
        contasList.add(cc3);

        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(cliente1);
        associadoList.add(cliente2);
        associadoList.add(cliente3);

        System.out.println("\n Lista de contas: " + contasList);
        System.out.println("\n Lista de associados: " + associadoList);

        //1.f
        cc2.deposita(1000);
        cc2.atualiza(0.05);
        cc2.saca(1000);
        System.out.println("\nConta corrente movimentada: "+cp2);


        //1.g
        cc1.setQuantidadeDeCotas(100);
        cc2.setQuantidadeDeCotas(400);
        cc3.setQuantidadeDeCotas(600);
        cliente1.setQuantidadeDeCotas(300);
        cliente2.setQuantidadeDeCotas(600);
        cliente3.setQuantidadeDeCotas(600);

        System.out.println("\nAtualização das contas" + associadoList);

        /*
        for (Conta conta : contasList) {
            conta.atualiza(0.05);
        }
        */

        //1.h

        associadoList.sort(Comparator.comparing(Associado::getQuantidadeDeCotas).reversed());
        System.out.println("\nLista de associados ordenada: " + associadoList);
        Associado maiorAssociado = associadoList.stream()
                .max(Comparator.comparing(Associado::getQuantidadeDeCotas))
                .get();
        for(Associado associado : associadoList){
            if(associado.getQuantidadeDeCotas() >= maiorAssociado.getQuantidadeDeCotas()){
                System.out.println("Associado com mais cotas: " + associado);
            }
        }


        //1.i
        contasList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nLista de contas ordenada: " + contasList);

        Conta maiorConta = contasList.stream()
                .max(Comparator.comparing(Conta::getSaldo))
                .get();
        for(Conta conta : contasList){
            if(conta.getSaldo() >= maiorConta.getSaldo()){
                System.out.println("Conta com mais saldo: " + conta);
            }
        }






















    }
}

package controller;

import model.Carro;
import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args){
        //c.i c.ii
        Conta conta1 = new Conta(1,23000.00);
        Conta conta2 = new Conta(2,20000.30);
        Conta conta3 = new Conta();
        Conta conta4 = new Conta();
        Conta conta5 = new Conta(5000);
        Conta conta6 = new Conta(1000.00);

        //iv
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);
        System.out.println(conta6);

        //v
        conta1.deposita(3000.00);
        conta2.deposita(2000.00);
        conta3.setId(3);
        conta3.setSaldo(4000.00);
        conta4.setId(4);
        conta4.setSaldo(6500.00);
        conta5.setId(5);
        conta6.setId(6);

        //vi
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getId());
        System.out.println(conta4.getSaldo());
        System.out.println(conta5.getId());
        System.out.println(conta6.getSaldo());

        //2.a

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        listaContas.add(conta5);
        listaContas.add(conta6);

        //2.d
        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);
        contasMap.put(conta6.getId(), conta6);

        //2.e
        System.out.println("\nColeção do tipo list" + listaContas);
        System.out.println("\nColeção do tipo map" + contasMap);

        //2.f

        listaContas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\nOrdenando as contas pelo id em ordem decrescente: ");
        System.out.println(listaContas);
        System.out.println();

        //2.g
        for(Conta conta : listaContas){
            if(conta.getId() == 3){
                System.out.println("\nConta com id=3: " + conta);
            }
        }

        //2.h
        System.out.println();
        System.out.print("\nLocalizando pela chave de pesquisa (id=3)");
        Conta conta = listaContas.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(conta);



    }
}

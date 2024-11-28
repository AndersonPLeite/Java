package controller;

import model.Carro;
import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args){
        Conta conta1 = new Conta(1,23000.00);
        Conta conta2 = new Conta(2,20000.30);
        Conta conta3 = new Conta(3,3200.75);
        Conta conta4 = new Conta(4,7300.50);
        Conta conta5 = new Conta(5,5500.00);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);

        conta3.deposita(10000.00);

        System.out.println("Saldo da conta "+ conta3.getId() + " =R$ " + conta3.getSaldo());

        conta5.saca(3000.00);
        conta5.atualizar(25);
        System.out.println("Taxa aplicada com sucesso, seu saldo foi atualizado!");
        System.out.println("O novo saldo da conta "+ conta5.getId() +  " é =R$ " + conta5.getSaldo());

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        listaContas.add(conta5);


        listaContas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nOrdenando as contas pelo saldo");
        System.out.println(listaContas);

        System.out.println("\n Estes são os saldos de todas as contas: \n" + listaContas);
        Conta contaBusca = listaContas.stream().filter(c -> c.getId() == 2).findAny().orElse(null);
        System.out.println(contaBusca);

        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);

        System.out.println("\nBusca pelas conta de id=1 e id=4 na coleção Map");
        System.out.println(contasMap.get(1));
        System.out.println(contasMap.get(4));
    }
}

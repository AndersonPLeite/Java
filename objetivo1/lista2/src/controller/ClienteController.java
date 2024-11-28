package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {


    public static void main(String[] args){
        Cliente cliente1 = new Cliente(1,"João","Silva","123.456.789-10","12345-678","Rua 1, 123","(11) 1234-5678","    ");
        Cliente cliente2 = new Cliente(2,"Maria","Santos","987.654.321-10","54321-876","Rua 2, 321","(11) 8765-4321","  ");
        Cliente cliente3 = new Cliente(3,"José","Oliveira","456.789.123-10","67890-543","Rua 3, 213","(11) 5432-1876","    ");
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();
        Cliente cliente6 = new Cliente(6,"José","456.789.163-10","Rua 6, 213","(11) 5466-1076");
        Cliente cliente7 = new Cliente(7,"Maria","987.654.321-10","Rua 2, 321","(11) 8765-4321");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);
        System.out.println(cliente7);

        cliente1.setCep("54321-876");
        cliente1.setEndereco("Rua 2, 321");
        cliente1.setEmail("jao@gmail.com");
        cliente2.setEmail("maria@gamil.com");
        cliente3.setEmail("josé@gmail.com");
        cliente4.setNome("Vânia");
        cliente4.setSobrenome("Silva");
        cliente4.setCpf("987.654.321-10");
        cliente4.setCep("54321-876");
        cliente5.setNome("Juvenal");
        cliente5.setSobrenome("Silva");
        cliente5.setCpf("987.654.321-10");
        cliente5.setCep("54321-876");
        cliente6.setTelefone("(11) 8765-4321");
        cliente7.setEndereco("Rua 10, 332");
        cliente7.setEmail("mariaa@gmail.com");
        cliente7.setSobrenome("Santos");


        cliente1.getCpf();
        cliente2.getCpf();
        cliente3.getEmail();
        cliente4.getNome();
        cliente5.getNome();
        cliente6.getTelefone();
        cliente7.getEndereco();

        List<Cliente> clientesList  = new ArrayList<>();
        clientesList.add(cliente1);
        clientesList.add(cliente2);
        clientesList.add(cliente3);
        clientesList.add(cliente4);
        clientesList.add(cliente5);
        clientesList.add(cliente6);
        clientesList.add(cliente7);
        System.out.println("\nLista de clientes: ");
        System.out.println(clientesList);

        //Lista de clientes ordenados por id
        System.out.println();
        clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println("Lista de clientes ordenados por id: ");
        System.out.println(clientesList);

        //Pesquisa ninária

        for(Cliente cliente : clientesList){
            if(cliente.getId() == 7){
                System.out.println("Resultado da pesquisa binária buscando o id 7: ");
                System.out.println(cliente);
            }
        }

        System.out.println();
        clientesList.sort(Comparator.comparing(Cliente::getId));
        System.out.println(clientesList.get(Collections.binarySearch(clientesList, cliente7, Comparator.comparing(Cliente::getId))));


        Map<Integer, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(cliente1.getId(),cliente1);
        clientesMap.put(cliente2.getId(),cliente2);
        clientesMap.put(cliente3.getId(),cliente3);
        clientesMap.put(cliente4.getId(),cliente4);
        clientesMap.put(cliente5.getId(),cliente5);
        clientesMap.put(cliente6.getId(),cliente6);
        clientesMap.put(cliente7.getId(),cliente7);
        System.out.println("\nColeção tipo Map " + clientesMap);
        System.out.println();

        System.out.println("Localizando o cliente pela chave de pesquisa (id=5 coleção tipo map): ");
        System.out.println(clientesMap.get(5));

































    }
}

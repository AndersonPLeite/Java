package controller;

import model.Carro;
import model.Conta;
import model.Funcionario;
import model.Produto;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args){
        //c.i c.ii
        Funcionario funcionario1 = new Funcionario("Adrieli", 5667.67);
        Funcionario funcionario2 = new Funcionario("João", 4500.00);
        Funcionario funcionario3 = new Funcionario();
        Funcionario funcionario4 = new Funcionario();
        Funcionario funcionario5 = new Funcionario(1, "Maria");
        Funcionario funcionario6 = new Funcionario(2, "José");

        //iv
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
        System.out.println(funcionario6);

        //v
        funcionario1.setId(3);
        funcionario4.setNome("Carlos");
        funcionario3.setSalario(3000.00);
        funcionario2.setId(2);
        funcionario5.setSalario(4000.00);
        funcionario6.setNome("Pedro");
        funcionario6.setSalario(5000.00);

        //vi
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getId());
        System.out.println(funcionario3.getSalario());
        System.out.println(funcionario4.getNome());
        System.out.println(funcionario5.getSalario());
        System.out.println(funcionario6.getNome());

        //2.a
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);
        funcionarioList.add(funcionario6);


        //2.d
        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(1, funcionario1);
        funcionarioMap.put(2, funcionario2);
        funcionarioMap.put(3, funcionario3);
        funcionarioMap.put(4, funcionario4);
        funcionarioMap.put(5, funcionario5);
        funcionarioMap.put(6, funcionario6);

        //2.e
        System.out.println("\nColeção do tipo list\n" + funcionarioList);
        System.out.println("\nColeção do tipo map\n" + funcionarioMap);

        //2.f
        funcionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("\nOrdenando os funcionários pelo id em ordem decrescente: ");
        System.out.println(funcionarioList);
        System.out.println();


        //2.g
        for(Funcionario funcionario : funcionarioList){
            if(funcionario.getId() == 3){
                System.out.println("\nFuncionário com id=3: " + funcionario);
            }
        }

        //2.h
        System.out.println();
        System.out.print("\nLocalizando pela chave de pesquisa (id=3)");
        Funcionario funcionario = funcionarioList.stream().filter(f -> f.getId() == 3).findAny().orElse(null);
        System.out.println(funcionario);

    }
}

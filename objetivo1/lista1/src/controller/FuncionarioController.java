package controller;

import model.Funcionario;
import model.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuncionarioController {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Adrieli", 5667.67);
        Funcionario funcionario2 = new Funcionario("João", 4500.00);
        Funcionario funcionario3 = new Funcionario();
        Funcionario funcionario4 = new Funcionario();
        Funcionario funcionario5 = new Funcionario(1, "Maria");
        Funcionario funcionario6 = new Funcionario(2, "José");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
        System.out.println(funcionario6);


        funcionario1.setId(1);
        funcionario4.setNome("Carlos");
        funcionario3.setSalario(3000.00);
        funcionario2.setId(2);
        funcionario5.setSalario(4000.00);
        funcionario6.setNome("Pedro");
        funcionario6.setSalario(5000.00);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getId());
        System.out.println(funcionario3.getSalario());
        System.out.println(funcionario4.getNome());
        System.out.println(funcionario5.getSalario());
        System.out.println(funcionario6.getNome());

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);
        funcionarioList.add(funcionario6);

        System.out.println("\nColeção do tipo list\n" + funcionarioList);

        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getSalario() == 3000.00) {
                System.out.println("O funcionário " + funcionario3.getNome() + "tem salário de: " );
                System.out.println(funcionario);
            }
        }

        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(1, funcionario1);
        funcionarioMap.put(2, funcionario2);
        funcionarioMap.put(3, funcionario3);
        funcionarioMap.put(4, funcionario4);
        funcionarioMap.put(5, funcionario5);
        funcionarioMap.put(6, funcionario6);

        System.out.println("\nColeção do tipo map\n" + funcionarioMap);

    }
}

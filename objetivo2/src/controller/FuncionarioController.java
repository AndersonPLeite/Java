package controller;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import java.text.NumberFormat;
public class FuncionarioController {
    public static void main(String[] args){

        //1.c
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Daniel", 2500);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor();
        Gerente gerente1 = new Gerente("Carla", 4500);
        Gerente gerente2 = new Gerente();


        //1.d
        System.out.println(desenvolvedor1);
        System.out.println(desenvolvedor2);
        System.out.println(gerente1);
        System.out.println(gerente2);

        //1.e
        desenvolvedor2.setNome("João");
        desenvolvedor2.setSalario(2500);
        gerente2.setNome("Maria");
        gerente2.setSalario(4500);

        //1.f

        System.out.println("\nBonus dos funcionários: ");
        System.out.println("Desenvolvedor 1: R$"+ desenvolvedor1.getBonus());
        System.out.println("Desenvolvedor 2: R$"+ desenvolvedor2.getBonus());
        System.out.println("Gerente 1: R$ "+ gerente1.getBonus());
        System.out.println("Gerente 2: R$ "+ gerente2.getBonus());

        /// 1.g.i Não é possível instanciar um objeto de uma classe abstrata
        /// 1.g.ii Nas classes gerente e desenvolvedor para sobrescrever o método getBonus

        //2
        Gerente ger1 = new Gerente("Janaína", 6500);
        Gerente ger2 = new Gerente("Júlio", 4500);

        Desenvolvedor dev1 = new Desenvolvedor("Júlia", 3500);
        Desenvolvedor dev2 = new Desenvolvedor("Karina", 3500);
        Desenvolvedor dev3 = new Desenvolvedor("Marta", 3500);
        Desenvolvedor dev4 = new Desenvolvedor("Michele", 3500);
        Desenvolvedor dev5 = new Desenvolvedor("Henrique", 3500);
        Desenvolvedor dev6 = new Desenvolvedor("Donavan", 3500);

        Desenvolvedor dev7 = new Desenvolvedor("Jorge", 2500);
        Desenvolvedor dev8 = new Desenvolvedor("Matheus", 2500);
        Desenvolvedor dev9 = new Desenvolvedor("Mágda", 2500);
        Desenvolvedor dev10 = new Desenvolvedor("Jorge", 2500);
        Desenvolvedor dev11 = new Desenvolvedor("Joselina", 2500);
        Desenvolvedor dev12 = new Desenvolvedor("Joanna", 2500);

        Desenvolvedor dev13 = new Desenvolvedor("Joanna", 1800);
        Desenvolvedor dev14 = new Desenvolvedor("Janaina", 1800);
        Desenvolvedor dev15 = new Desenvolvedor("Richarlison", 1800);
        Desenvolvedor dev16 = new Desenvolvedor("Ronaldinho Gaúcho", 1800);


        List<Funcionario> funcionariosList = new ArrayList<>();

        funcionariosList.add(ger1);
        funcionariosList.add(ger2);
        funcionariosList.add(dev1);
        funcionariosList.add(dev2);
        funcionariosList.add(dev3);
        funcionariosList.add(dev4);
        funcionariosList.add(dev5);
        funcionariosList.add(dev6);
        funcionariosList.add(dev7);
        funcionariosList.add(dev8);
        funcionariosList.add(dev9);
        funcionariosList.add(dev10);
        funcionariosList.add(dev11);
        funcionariosList.add(dev12);
        funcionariosList.add(dev13);
        funcionariosList.add(dev14);
        funcionariosList.add(dev15);
        funcionariosList.add(dev16);


        System.out.println("\n Folha salarial da empresa: " + funcionariosList.size() + " funcionários\n" + funcionariosList );


        System.out.println("\nTotal de salários da empresa com bônus: R$ ");
        System.out.println(NumberFormat.getCurrencyInstance().format(funcionariosList.stream().mapToDouble(f -> f.getSalario() + f.getBonus()).sum()));
        System.out.println("\nTotal de salários da empresa sem bônus: R$ ");
        double totalFolha_semBonus = funcionariosList.stream().mapToDouble(f -> f.getSalario()).sum();
        System.out.println(totalFolha_semBonus);


        System.out.println("\n Total do saĺário bruto de cada funcionário:R$ ");
        funcionariosList.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nCargo: " + f.getClass().getSimpleName());
            System.out.println("\nFuncionário: " + f.getNome() + " - Salário Bruto: " + NumberFormat.getCurrencyInstance().format(salarioBruto));
        });

        System.out.println("\nNova folha com ajuste de 5% no salário de cada funcionário: ");
        System.out.println(
                NumberFormat.getCurrencyInstance().format(funcionariosList.stream().mapToDouble(f -> f.getSalario() + f.getBonus()).map(s -> s * 1.05).sum())
        );

    }

}

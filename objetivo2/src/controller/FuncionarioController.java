package controller;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import java.text.NumberFormat;
public class FuncionarioController {
    public static void main(String[] args){
        Desenvolvedor desenvolvedor1 = new Desenvolvedor();
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Felipe", 3000);

        Gerente gerente1 = new Gerente();
        Gerente gerente2 = new Gerente("Márcia", 5000);

        System.out.println(desenvolvedor1+"\n"+desenvolvedor2+"\n"+gerente1+"\n"+gerente2);
        desenvolvedor1.setNome("João");
        desenvolvedor1.setSalario(2500);
        gerente1.setNome("Maria");
        gerente1.setSalario(4500);
        desenvolvedor2.setSalario(3500);
        gerente2.setNome("Carla");
        System.out.println("\nRegistro dos funcionários atualizados: ");
        System.out.println(desenvolvedor1+"\n"+desenvolvedor2+"\n"+gerente1+"\n"+gerente2);

        System.out.println("\nBonus dos funcionários: ");
        System.out.println("Desenvolvedor 1: R$"+ desenvolvedor1.getBonus());
        System.out.println("Desenvolvedor 2: R$"+ desenvolvedor2.getBonus());
        System.out.println("Gerente 1: R$ "+ gerente1.getBonus());
        System.out.println("Gerente 2: R$ "+ gerente2.getBonus());

        Gerente ger1 = new Gerente("Janaína", 6500);
        Gerente ger2 = new GerenteDesenvolvimento("Júlio", 4500);

        Desenvolvedor dev1 = new DesenvolvedorSenior("Júlia", 3500);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Karina", 3500);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Marta", 3500);
        Desenvolvedor dev4 = new DesenvolvedorSenior("Michele", 3500);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Henrique", 3500);
        Desenvolvedor dev6 = new DesenvolvedorSenior("Donavan", 3500);

        Desenvolvedor dev7 = new DesenvolvedorPleno("Jorge", 2500);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Matheus", 2500);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Mágda", 2500);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Jorge", 2500);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Joselina", 2500);
        DesenvolvedorPleno dev12 = new DesenvolvedorPleno("Joanna", 2500);

        Desenvolvedor dev13 = new DesenvolvedorJunior("Joanna", 1800);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Janaina", 1800);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Richarlison", 1800);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Ronaldinho Gaúcho", 1800);


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

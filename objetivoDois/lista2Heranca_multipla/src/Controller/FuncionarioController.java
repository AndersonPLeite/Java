package Controller;

import java.util.*;

import model.Funcionario;
import model.Gerente;
import model.Investidor;
import model.Desenvolvedor;
import model.Cliente;

public class FuncionarioController {
    public static void main(String[] args) {

        //1.c
        Desenvolvedor dev1 = new Desenvolvedor("João", 2500.00);
        Desenvolvedor dev2 = new Desenvolvedor("Maria", 2500.00);
        Desenvolvedor dev3 = new Desenvolvedor("José", 2500.00);
        Desenvolvedor dev4 = new Desenvolvedor("Ana", 2500.00);
        Desenvolvedor dev5 = new Desenvolvedor("Carlos", 2500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Paula", 2500.00);

        System.out.println("\nDesenvolvedores: ");
        System.out.println(dev1 + "\n" + dev2 + "\n" + dev3 + "\n" + dev4 + "\n" + dev5 + "\n" + dev6);


        Gerente g1 = new Gerente("Pedro", 5000.00, "PETR4", 100);
        Gerente g2 = new Gerente("Marta", 5000.00, "VALE3", 200);
        Gerente g3 = new Gerente("Ricardo", 5000.00, "ITUB4", 300);
        Gerente g4 = new Gerente("Juliana", 5000.00, "BBDC4", 400);
        Gerente g5 = new Gerente("Fernando", 5000.00, "BBAS3", 500);
        Gerente g6 = new Gerente("Luciana", 7000.00, "ABEV3", 600);

        System.out.println("\nGerentes: ");
        System.out.println(g1 + "\n" + g2 + "\n" + g3 + "\n" + g4 + "\n" + g5 + "\n" + g6);

        Cliente cl1 = new Cliente(1, "João", "Campagnaro", "PETR4", 170);
        Cliente cl2 = new Cliente(2, "Maria", "Silva", "VALE3", 240);
        Cliente cl3 = new Cliente(3, "José", "Suedine", "ITUB4", 30);
        Cliente cl4 = new Cliente(4, "Ana", "Silva", "BBDC4", 400);
        Cliente cl5 = new Cliente(5, "Carlos", "Silva", "BBAS3", 570);
        Cliente cl6 = new Cliente(6, "Paula", "Relisclark", "ABEV3", 300);
        System.out.println("\nClientes: ");
        System.out.println(cl1 + "\n" + cl2 + "\n" + cl3 + "\n" + cl4 + "\n" + cl5 + "\n" + cl6);


        //1.d
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(dev1);
        funcionariosList.add(dev2);
        funcionariosList.add(dev3);
        funcionariosList.add(dev4);
        funcionariosList.add(dev5);
        funcionariosList.add(dev6);
        funcionariosList.add(g1);
        funcionariosList.add(g2);
        funcionariosList.add(g6);


        List<Investidor> investidoresList = new ArrayList<>();
        investidoresList.add(cl1);
        investidoresList.add(cl2);
        investidoresList.add(cl3);
        investidoresList.add(cl4);
        investidoresList.add(cl5);
        investidoresList.add(cl6);

        //1.e
        System.out.println("\nColeção de Funcionários: " + funcionariosList);
        System.out.println("\nColeção de Investidores: " + investidoresList);

        //1.f
        funcionariosList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("Lista de funcionários da empresa: " + funcionariosList);

        //1.g
        System.out.println("\nLista de investidores da empresa ordenado pelo número de cotas: ");
        investidoresList.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println(investidoresList);

        //1.h
        investidoresList.sort(Comparator.comparing(Investidor::getQtdeCotas).reversed());
        System.out.println("\nLista de investidores da empresa ordenado pelo número de cotas: ");
        System.out.println(investidoresList);

        //1.i
        Funcionario funcionarioComMaiorSalario = Collections.max(funcionariosList, Comparator.comparing(Funcionario::getSalario));
        funcionariosList.forEach(f -> {
            if(f.getSalario() == funcionarioComMaiorSalario.getSalario()){
                System.out.println("Funcionário com maior salário: " + f.getNome() + "\n" + "R$ " + f.getSalario());
            }
        });


        //1.j
        Investidor investidorMaisCotas = investidoresList.stream().max(Comparator.comparing(Investidor::getQtdeCotas)).get();
        System.out.println("\nInvestidor com mais cotas: " + investidorMaisCotas);

        Investidor iMaisCotas = Collections.max(investidoresList, Comparator.comparing(Investidor::getQtdeCotas));
        investidoresList.forEach(i -> {
            if(i.getQtdeCotas() == iMaisCotas.getQtdeCotas()){
                System.out.println("Investidor com mais cotas: " + i);
            }
        });
    }

}

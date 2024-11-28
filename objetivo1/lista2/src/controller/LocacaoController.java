package controller;
import model.Locacao;

import java.util.*;
import java.time.LocalDateTime;

public class LocacaoController {
    public static void main(String[] args){

        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao();


        Locacao locacao3 = new Locacao(1, LocalDateTime.now(), "2021-10-10", "10:00", 100, 100.0, 100.0, false);
        Locacao locacao4 = new Locacao("10:00", 100, 100.0, 100.0);
        Locacao locacao5 = new Locacao(2, LocalDateTime.now(), "2021-10-10", "10:00", 100, 100.0, 100.0, false);



        Locacao locacao6 = new Locacao(3, LocalDateTime.now(), "2021-10-10", "10:00", 100, 100.0, 100.0, false);
        Locacao locacao7 = new Locacao(8,false);
        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);
        System.out.println(locacao6);
        System.out.println(locacao7);

        locacao1.setId(1);
        locacao1.setValorCalcao(200.0);
        locacao1.setValor_locacao(400.0);
        locacao2.setId(2);
        locacao2.setQuilometragem(300);
        locacao2.setValorCalcao(300.0);
        locacao3.setHoraDevolucao("11:00");
        locacao3.setQuilometragem(900);
        locacao3.setId(900);
        locacao3.setDataLocacao(LocalDateTime.of(2021, 10, 10, 10, 00));
        locacao3.setValorCalcao(350.0);
        locacao3.setValor_locacao(500.0);
        locacao4.setHoraDevolucao("12:00");
        locacao4.setQuilometragem(1000);
        locacao4.setId(10);
        locacao4.setDevolvido(true);
        locacao5.setHoraDevolucao("13:00");
        locacao5.setQuilometragem(1100);
        locacao5.setId(11);
        locacao5.setValorCalcao(400.0);
        locacao5.setValor_locacao(600.0);
        locacao5.setDevolvido(true);
        locacao6.setHoraDevolucao("14:00");
        locacao6.setQuilometragem(1200);
        locacao6.setId(12);
        locacao6.setValorCalcao(450.0);
        locacao6.setValor_locacao(700.0);
        locacao6.setDataLocacao(LocalDateTime.of(2022, 10, 12, 13, 00));
        locacao6.setDevolvido(true);
        locacao7.setId(13);
        locacao7.setDevolvido(true);

        System.out.println();
        locacao1.getDataLocacao();
        locacao1.getDataDevolucao();
        locacao1.getHoraDevolucao();
        locacao1.getQuilometragem();
        locacao2.getValorCalcao();
        locacao2.getValor_locacao();
        locacao2.getId();
        locacao3.getDataLocacao();
        locacao3.getDevolvido();
        locacao3.getDataDevolucao();
        locacao4.getHoraDevolucao();
        locacao4.getQuilometragem();
        locacao4.getValorCalcao();
        locacao4.getValor_locacao();
        locacao4.getId();
        locacao5.getDataLocacao();
        locacao5.getDevolvido();
        locacao5.getDataDevolucao();
        locacao5.getHoraDevolucao();
        locacao5.getQuilometragem();
        locacao5.getValorCalcao();
        locacao6.getValor_locacao();
        locacao6.getId();
        locacao7.getDevolvido();
        locacao7.getId();
        locacao6.getDataLocacao();

        List<Locacao> locacoesList = new ArrayList<>();
        locacoesList.add(locacao1);
        locacoesList.add(locacao2);
        locacoesList.add(locacao3);
        locacoesList.add(locacao4);
        locacoesList.add(locacao5);
        locacoesList.add(locacao6);
        locacoesList.add(locacao7);
        System.out.println();
        System.out.println("\nLista de locações: ");

        for (Locacao locacao : locacoesList) {
            if(locacao.getId() == 4) {
                System.out.println("Pesquisa  brute force pelo id=4: ");
                System.out.println(locacao);
            }
        }

        System.out.println();
        System.out.print("Localizando pelo id=4:(método fluxos para estrutura de dados) ");
        Locacao locacaoFind = locacoesList.stream().filter(c -> c.getId() == 4).findAny().orElse(null);
        System.out.println(locacaoFind);
        System.out.println();



        Map<Integer, Locacao> locacoesMap = new HashMap<>();
        locacoesMap.put(locacao1.getId(), locacao1);
        locacoesMap.put(locacao2.getId(), locacao2);
        locacoesMap.put(locacao3.getId(), locacao3);
        locacoesMap.put(locacao4.getId(), locacao4);
        locacoesMap.put(locacao5.getId(), locacao5);
        locacoesMap.put(locacao6.getId(), locacao6);
        locacoesMap.put(locacao7.getId(), locacao7);
        System.out.println("\nLocações Map: " + locacoesMap);
        System.out.println();
        System.out.println(locacoesMap.get(3));
        System.out.println(locacoesMap.get(4));
    }
}

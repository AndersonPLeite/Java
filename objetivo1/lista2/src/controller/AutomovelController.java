package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args){

        //1.c.iii
        Automovel automovel1 = new Automovel(1,"2939237nksn","AOT2527","Verde",4,"gasolina",4434,"218738265454",625.57);
        Automovel automovel2 = new Automovel(2,"832764gsg83746","BHT3546","Azul",4,"Alcool",53732,"2989834dfhu54y",388.90);
        Automovel automovel3 = new Automovel(3,"293182932","ATY0237","Branco","290894382kdj439589");
        Automovel automovel4 = new Automovel();
        Automovel automovel5 = new Automovel();

        //1.c.iv
        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);
        System.out.println(automovel5);

        //1.c.v
        automovel1.setCor("vermelho");
        automovel2.setChassi("187weeq138636ddd64");
        automovel3.setId(3);
        automovel3.setPlaca("283782gfggd");
        automovel3.setQuilometragem(234);
        automovel3.setPlaca("AOT2223");
        automovel3.setRenavan("72847sfhhsfgf7y");
        automovel4.setId(4);
        automovel4.setCor("Prata");
        automovel4.setRenavan("198932jshdf37846");
        automovel4.setValor_locacao(233.50);
        automovel5.setId(5);
        automovel5.setCor("Preto");
        automovel5.setRenavan("198932jshdf37846");
        automovel5.setValor_locacao(233.50);

        //1.c.vi
        System.out.println("\n Id do automóvel 1 é " + automovel1.getId());
        System.out.println("\n A cor do automóvel 2 é " + automovel2.getCor());
        System.out.println("\n O renavan do automóvel 3 é " + automovel3.getRenavan());
        System.out.println("\n A placa do automóvel 3 é " +automovel3.getPlaca());
        System.out.println("\n O valor da locação do automóvel 4 é " + automovel4.getValor_locacao());
        System.out.println("\n Id do automóvel 5 é " + automovel5.getId());
        System.out.println("\n A cor do automóvel 5 é " + automovel5.getCor());


        //2.a
        List <Automovel> listaAutomovel = new ArrayList<>();
        listaAutomovel.add(automovel1);
        listaAutomovel.add(automovel2);
        listaAutomovel.add(automovel3);
        listaAutomovel.add(automovel4);
        listaAutomovel.add(automovel5);


        Map<Integer,Automovel> automovelMap = new HashMap<>();
        automovelMap.put(automovel1.getId(),automovel1);
        automovelMap.put(automovel2.getId(),automovel2);
        automovelMap.put(automovel3.getId(),automovel3);
        automovelMap.put(automovel4.getId(),automovel4);
        automovelMap.put(automovel5.getId(),automovel5);

        //2.e
        System.out.println("\n Coleção tipo List");
        for (Automovel automovel : listaAutomovel) {
            System.out.println(automovel);
        }
        System.out.println("\n Coleção tipo Map");
        System.out.println(automovelMap);


        //2.f.i
        listaAutomovel.sort(Comparator.comparing(Automovel::getRenavan).reversed());
        System.out.println("\n Lista de automóveis ordenada por renavan de forma decrescente");
        for (Automovel automovel : listaAutomovel) {
            System.out.println(automovel);
        }

        //2.g


        System.out.println();
        System.out.print("\nLocalizando pela chave de pesquisa id=3");
        Automovel automovel = listaAutomovel.stream().filter(a -> a.getId() == 3).findAny().orElse(null);
        System.out.println(automovel);

        //2.h
        System.out.println();
        System.out.println("\nRealizando uma pesquisa binária");
        listaAutomovel.sort(Comparator.comparing(Automovel::getRenavan));
        System.out.println(listaAutomovel.get(
                Collections.binarySearch(
                        listaAutomovel,
                        automovel3,
                        Comparator.comparing(Automovel::getRenavan)
                )
        ));


























    }
}

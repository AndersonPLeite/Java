package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args){
       //c.i
        Carro carro1 = new Carro(1,"Renault", "Clio", 2007);
        System.out.println(carro1);
        Carro carro2 = new Carro(2,"Renault", "Sandero",2011);
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        //c.ii
        carro3.setId(3);
        carro3.setMarca("Chevrolet");
        carro3.setModelo("Corsa Sedan");
        carro3.setAnoFabricacao(2005);
        carro4.setAnoFabricacao(2015);
        carro4.setId(4);
        carro4.setMarca("Volkswagen");
        carro4.setModelo("Gol");
        //c.iv
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        //c.v
        carro1.setMarca("BMW");
        carro1.setModelo("X5");
        carro2.setModelo("SUV");
        carro3.setAnoFabricacao(2000);
        carro4.setMarca("Fiat");
        carro4.setModelo("Uno");
        System.out.println();
        //c.vi
        System.out.println(carro1.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro3.getAnoFabricacao());
        System.out.println(carro4.getId());

        //2.a
        //COLEÇÃO TIPO LIST
        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);


        //COLEÇÃO  TIPO MAP
        Map<String, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getModelo(), carro1 );
        carrosMap.put(carro2.getModelo(), carro2 );
        carrosMap.put(carro3.getModelo(), carro3 );
        carrosMap.put(carro4.getModelo(), carro4 );
        System.out.println("Coleção do tipo map");
        System.out.println("\n");
        System.out.println(carrosMap + "\n");
        System.out.println("\n Localizar Carro na coleção Map");
        System.out.println(carrosMap.get(carro3.getModelo()));
        //2.e
        System.out.println("\nLista de carros");
        System.out.println(carrosList);
        System.out.println();

        //2.f
        System.out.println("\nLista em ordem decrescente: ");
        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carrosList);

        //2.g
        for(Carro carro : carrosList){
            if(carro.getId() == 3){
                System.out.println("\nCarro com id=3: " + carro);
            }
        }



        System.out.println();
        System.out.print("\nLocalizando pela chave de pesquisa (id=3)");
        Carro carroFind2 = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind2);

    }
}

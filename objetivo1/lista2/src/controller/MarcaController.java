package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String []args){

        Marca marca1 = new Marca();
        Marca marca2 = new Marca();

        Marca marca3 = new Marca(1, "Fiat");
        Marca marca4 = new Marca("Chevrolet");
        Marca marca5 = new Marca(2, "Ford");

        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);
        System.out.println(marca5);

        marca2.setId(3);
        marca1.setDescricao("Toyota");
        marca2.setDescricao("Honda");
        marca1.setId(4);
        marca3.setDescricao("Hyundai");
        marca4.setId(5);


        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());
        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());
        System.out.println(marca3.getId());
        System.out.println(marca3.getDescricao());
        System.out.println(marca4.getId());
        System.out.println(marca4.getDescricao());
        System.out.println(marca5.getId());
        System.out.println(marca5.getDescricao());

        List<Marca> marcasList = new ArrayList<>();
        marcasList.add(marca1);
        marcasList.add(marca2);
        marcasList.add(marca3);
        marcasList.add(marca4);
        marcasList.add(marca5);
        marcasList.sort(Comparator.comparing(Marca::getId));
        System.out.println("Lista de Marcas");
        System.out.println(marcasList);

        Map<Integer, Marca> marcasMap = new HashMap<>();
        marcasMap.put(marca1.getId(), marca1);
        marcasMap.put(marca2.getId(), marca2);
        marcasMap.put(marca3.getId(), marca3);
        marcasMap.put(marca4.getId(), marca4);
        marcasMap.put(marca5.getId(), marca5);
        System.out.println("Map das Marcas:\n" + marcasMap);

        System.out.println("Marca com id 3: " + marcasMap.get(3));


    }
}

package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String []args){
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();
        Modelo modelo3 = new Modelo(1, "Onix");
        Modelo modelo4 = new Modelo("Gol");
        Modelo modelo5 = new Modelo(2, "Palio");
        Modelo modelo6 = new Modelo(3, "HB20");
        Modelo modelo7 = new Modelo(4, "Civic");
        Modelo modelo8 = new Modelo(5, "Corolla");


        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);
        System.out.println(modelo5);
        System.out.println(modelo6);
        System.out.println(modelo7);
        System.out.println(modelo8);

        modelo1.setId(6);
        modelo1.setDescricao("HB20");
        modelo2.setId(7);
        modelo2.setDescricao("Civic");
        modelo3.setId(8);
        modelo3.setDescricao("Corolla");
        modelo4.setId(9);
        modelo4.setDescricao("Onix");
        modelo5.setDescricao("Golf GTI");
        modelo6.setDescricao("Polo");



        List<Modelo> modelosList = new ArrayList<>();
        modelosList.add(modelo1);
        modelosList.add(modelo2);
        modelosList.add(modelo3);
        modelosList.add(modelo4);
        modelosList.add(modelo5);
        modelosList.add(modelo6);
        modelosList.add(modelo7);
        modelosList.add(modelo8);
        System.out.println("Lista de Modelos\n" + modelosList);

        modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("Lista de Modelos ordenada inversamente por id\n" + modelosList);


        System.out.println();
        System.out.print("\nLocalizando o modelo pela chave de pesquisa(id=7)(fluxos para estrutura de dadodos): ");
        Modelo modeloFind = modelosList.stream().filter(modelo -> modelo.getId() == 7).findFirst().orElse(null);
        System.out.println(modeloFind);


        Map<Integer, Modelo > modelosMap = new HashMap<>();
        modelosMap.put(modelo1.getId(), modelo1);
        modelosMap.put(modelo2.getId(), modelo2);
        modelosMap.put(modelo3.getId(), modelo3);
        modelosMap.put(modelo4.getId(), modelo4);
        modelosMap.put(modelo5.getId(), modelo5);
        modelosMap.put(modelo6.getId(), modelo6);
        modelosMap.put(modelo7.getId(), modelo7);
        modelosMap.put(modelo8.getId(), modelo8);
        System.out.println("Map dos Modelos\n" + modelosMap);

        System.out.println("\nLocalizando os modelos pela chave de pesquisa na coleção Map(id=5 e id=6): ");
        System.out.println("Modelo com id 5: " + modelosMap.get(5));
        System.out.println("Modelo com id 6: " + modelosMap.get(6));


    }
}

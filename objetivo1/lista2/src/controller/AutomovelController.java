package controller;

import model.Automovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomovelController {
    public static void main(String[] args){
        Automovel automovel1 = new Automovel(1,"2939237nksn","AOT2527","Verde",4,"gasolina",4434,"218738265454",625.57);
        Automovel automovel2 = new Automovel(2,"832764gsg83746","BHT3546","Azul",4,"Alcool",53732,"2989834dfhu54y",388.90);
        Automovel automovel3 = new Automovel(3,"293182932","ATY0237","Branco","290894382kdj439589");
        Automovel automovel4 = new Automovel();

        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);

        automovel4.setPlaca("AOT2223");
        automovel4.setCor("Prata");
        automovel4.setRenavan("198932jshdf37846");
        automovel4.setValor_locacao(233.50);
        System.out.println("Automóvel 4: " + " Placa: " + automovel4.getPlaca() + " Renavam: " + automovel4.getRenavan() + " Chassi: " + automovel4.getCor() + " Valor de locação: " + automovel4.getValor_locacao());

        List <Automovel> listaAutomovel = new ArrayList<>();
        listaAutomovel.add(automovel1);
        listaAutomovel.add(automovel2);
        listaAutomovel.add(automovel3);
        listaAutomovel.add(automovel4);
        System.out.println(listaAutomovel);
        automovel4.setId(4);

        Map<Integer,Automovel> automovelMap = new HashMap<>();
        automovelMap.put(automovel1.getId(),automovel1);
        automovelMap.put(automovel2.getId(),automovel2);
        automovelMap.put(automovel3.getId(),automovel3);
        automovelMap.put(automovel1.getId(),automovel4);

        System.out.println("\n Coleção tipo Map");
        System.out.println(automovelMap.get(automovel3.getId()) + "\n");
    }
}

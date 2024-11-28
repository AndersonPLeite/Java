package controller;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto("Correia", "Correia dentada do motor", 228.75, 43);
        Produto produto2 = new Produto("Roda", "Roda diamantada aro 20", 3500.75, 10);

        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        Produto produto5 = new Produto(1, "Turbo");
        Produto produto6 = new Produto(2, "Aerofólio");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println(produto5);
        System.out.println(produto6);

        produto3.setId(3);
        produto3.setNome("Pneu Michelan");
        produto3.setDescricao("Pneu aro 17");
        produto3.setValor(800.00);
        produto4.setEstoque(20);
        produto4.setNome("Pneu Pirelli");
        produto1.setEstoque(58);
        produto2.setValor(5000.00);
        produto6.setDescricao("Aerofólio de fibra de carbono");
        produto5.setValor(4500.00);



        System.out.println(produto3.getDescricao());
        System.out.println(produto4.getId());
        System.out.println(produto1.getValor());
        System.out.println(produto2.getEstoque());
        System.out.println(produto6.getDescricao());
        System.out.println(produto5.getValor());

        System.out.println(produto1.getNome());
        System.out.println(produto2.getNome());
        System.out.println(produto3.getNome());
        System.out.println(produto4.getEstoque());
        System.out.println(produto5.getValor());
        System.out.println(produto6.getDescricao());


        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        produtoList.add(produto6);
        System.out.println("\nColeção do tipo list\n" + produtoList);

        for (Produto produto : produtoList) {
            if (produto.getId() == 3) {
                System.out.println("Produto encontrado: " + produto.getNome());
                System.out.println(produto);
            }
        }

        System.out.println("\n\n\n");
        for (Produto produto : produtoList) {
            if (produto.getNome().equals("Turbo")) {
                System.out.println("Produto encontrado: " + produto.getNome());
                System.out.println(produto);
            }
        }

        System.out.println("\n\n\n");
        produtoList.sort(Comparator.comparing(Produto::getId));
        Produto produtoFind = produtoList.get(
                Collections.binarySearch(produtoList, new Produto(3, ""), Comparator.comparing(Produto::getId))
        );

        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        produtosMap.put(produto6.getId(), produto6);
        System.out.println("\nColeção do tipo map\n" + produtosMap);


    }
}

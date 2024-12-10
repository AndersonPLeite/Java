package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String args[]) {
        Cachorro c1 = new Cachorro(1, 1);
        Cachorro c2 = new Cachorro(1, 1);
        Cachorro c3 = new Cachorro(2, 2);
        Passaro p1 = new Passaro(2, 2);
        Passaro p2 = new Passaro(2, 2);
        Passaro p3 = new Passaro(2, 2);
        Peixe pe1 = new Peixe(3, 3);
        Peixe pe2 = new Peixe(3, 3);
        Peixe pe3 = new Peixe(3, 3);

        List<Animal> animaisList = new ArrayList<>();
        animaisList.add(c1);
        animaisList.add(c2);
        animaisList.add(c3);
        animaisList.add(p1);
        animaisList.add(p2);
        animaisList.add(p3);
        animaisList.add(pe1);
        animaisList.add(pe2);
        animaisList.add(pe3);

        System.out.println("\nAnimais criados: " + animaisList);


        animaisList.forEach(
                a -> {
                    a.mover(8.0, 8.0);
                    a.desenhar();
                    System.out.print(a);
                }
        );

        System.out.println("\nAnimais movidos: " + animaisList);

        animaisList.forEach(
                a -> {
                    if (a instanceof Peixe) {
                        ((Peixe) a).mover3D(5.0, 5.0, 5.0);
                        a.desenhar();
                        System.out.print(a);
                    } else if (a instanceof Passaro) {
                        if (a instanceof Passaro) {
                            ((Passaro) a).mover3D(5.0, 5.0, 5.0);
                            a.desenhar();
                            System.out.print(a);
                        }
                    } else if (a instanceof Cachorro) {
                        if (a instanceof Cachorro) {
                            a.mover(5.0, 5.0);
                            a.desenhar();
                            System.out.print(a);
                        }
                    }
                });
    }
}

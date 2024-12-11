package model;

import java.text.NumberFormat;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 0;
    }


    @Override
    public int quantidade() {
        return 0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "Nome=  " +getNome() +
                ", Salario= " + NumberFormat.getCurrencyInstance().format(this.getSalario()) +
                ", Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) +
                '}';
    }
}

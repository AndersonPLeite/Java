package model;

import java.text.NumberFormat;

public class GerenteGeral extends Gerente{
    public GerenteGeral() {
    }

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.40;
    }

    @Override public String toString() {
        return "Gerente Geral Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) + " " +
                "nome= " + super.getNome() + '\'' +
                ", salario= " + NumberFormat.getCurrencyInstance().format(super.getSalario()) +
                '}';
    }

}

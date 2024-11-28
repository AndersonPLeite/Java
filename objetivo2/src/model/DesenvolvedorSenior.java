package model;

import java.text.NumberFormat;

public class DesenvolvedorSenior extends Desenvolvedor{
    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }
    @Override public double getBonus() {
        return getSalario() * 0.10;
    }
    @Override public String toString() {
        return "DesenvolvedorSenior Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) + " " +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + NumberFormat.getCurrencyInstance().format(super.getSalario()) +
                '}';
    }
}

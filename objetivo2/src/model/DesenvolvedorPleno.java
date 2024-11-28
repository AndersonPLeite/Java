package model;

import java.text.NumberFormat;

public class DesenvolvedorPleno  extends  Desenvolvedor{
    public DesenvolvedorPleno() {
    }

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }
    @Override public double getBonus() {
        return getSalario() * 0.05;
    }
    @Override public String toString() {
        return "DesenvolvedorPleno Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) + " " +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + NumberFormat.getCurrencyInstance().format(super.getSalario()) +
                '}';
    }
}

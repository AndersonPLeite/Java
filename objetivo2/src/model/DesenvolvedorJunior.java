package model;
import java.text.NumberFormat;

public class DesenvolvedorJunior extends Desenvolvedor{
    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }
    @Override public double getBonus() {
        return getSalario() * 0.05;
    }
    @Override public String toString() {
        return "DesenvolvedorJunior Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) + " " +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + NumberFormat.getCurrencyInstance().format(super.getSalario()) +
                '}';
    }
}
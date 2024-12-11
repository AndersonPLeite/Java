package model;

public class ContaCorrente extends Conta implements Associado{
    public ContaCorrente(double saldo, int quantidadeDeCotas) {
        super(saldo);
    }

    public void setQuantidadeDeCotas(int i) {
    }
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public int getQuantidadeDeCotas() {
        return 0;
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                "} " + super.toString();
    }
}

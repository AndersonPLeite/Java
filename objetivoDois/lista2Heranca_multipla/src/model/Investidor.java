package model;

public interface Investidor {

    String getTicker();
    void setTicker(String ticker);

    void quantidade(int quantidade);

    int getQuantidade();

    void setQuantidade(int qtdeCotas);

    int getQtdeCotas();

    void setQtdeCotas(int qtdeCotas);
}


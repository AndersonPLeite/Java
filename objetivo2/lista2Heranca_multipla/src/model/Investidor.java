package model;

public interface Investidor {

    String getTicker();
    void setTicker(String ticker);

    void quantidade(int qtdeCotas);
}


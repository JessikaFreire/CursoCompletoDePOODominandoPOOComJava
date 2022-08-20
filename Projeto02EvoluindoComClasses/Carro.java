package Projeto02EvoluindoComClasses;

public class Carro {

    // #region Attributes
    private String modelo;
    private Integer ano;
    private String cor;
    // #endregion

    // #region Constructors
    public Carro() {
    }

    public Carro(String modelo, Integer ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    // #endregion

    // #region Getters and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    // #endregion

}

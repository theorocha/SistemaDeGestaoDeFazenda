/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author theo
 */


public class Gado {
    private String raca;
    private String sexo;
    private int idade_em_meses;
    private boolean vacinado;
    private int brinco;
    private String pasto;

    public String getPasto() {
        return pasto;
    }

    public void setPasto(String pasto) {
        this.pasto = pasto;
    }
    private Fazenda fazenda;

    public Gado(String raca, String sexo, int idade_em_meses, boolean vacinado, int brinco, String pasto) {
        this.raca = raca;
        this.sexo = sexo;
        this.idade_em_meses = idade_em_meses;
        this.vacinado = vacinado;
        this.brinco = brinco;
        this.pasto = pasto;
    }

  

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade_em_meses() {
        return idade_em_meses;
    }

    public void setIdade_em_meses(int idade_em_meses) {
        this.idade_em_meses = idade_em_meses;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public int getBrinco() {
        return brinco;
    }

    public void setBrinco(int brinco) {
        this.brinco = brinco;
    }

    

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }
    
    
    
    
}
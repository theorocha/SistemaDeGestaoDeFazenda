/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author theo
 */


public class Pasto {
    private String nome;
    private String capim;
    private int capacidade;
    private boolean cercaBoa;
    
    private ArrayList<Gado> animais;
    private Fazenda fazenda;

    public Pasto(String nome, String capim, int capacidade, boolean cercaBoa) {
        this.nome = nome;
        this.capim = capim;
        this.capacidade = capacidade;
        this.cercaBoa = cercaBoa;
        
        this.animais = new ArrayList();
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapim() {
        return capim;
    }

    public void setCapim(String capim) {
        this.capim = capim;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isCercaBoa() {
        return cercaBoa;
    }

    public void setCercaBoa(boolean cercaBoa) {
        this.cercaBoa = cercaBoa;
    }
    
}
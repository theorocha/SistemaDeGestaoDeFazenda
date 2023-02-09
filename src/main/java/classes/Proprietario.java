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

public class Proprietario extends Pessoa{
    private double renda;
    
    private Fazenda fazenda;

    public Proprietario(String nome, long cpf, String dataNasc, double renda) {
        super(nome, cpf, dataNasc);
        this.renda = renda;
    }

    public Proprietario(String nome, long cpf, String dataNasc) {
        super(nome, cpf, dataNasc);
    }
    
    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }
    
    
    
}
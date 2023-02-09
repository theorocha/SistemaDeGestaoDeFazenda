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
public class Fazenda {
    private double area;
    private String nomeFazenda;
    private String localizacao;
    private String escritura;
    
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Gado> animais;
    private ArrayList<Pasto> pastos;
    private Proprietario proprietario;
    private Gerencia gerencia;

    public Fazenda() {
        this.funcionarios = new ArrayList();
        this.animais = new ArrayList();
        this.pastos = new ArrayList();
    }
    
    

    public Fazenda(double area, String nomeFazenda, String localizacao, String escritura) {
        this.area = area;
        this.nomeFazenda = nomeFazenda;
        this.localizacao = localizacao;
        this.escritura = escritura;
        this.funcionarios = new ArrayList();
        this.animais = new ArrayList();
        this.pastos = new ArrayList();
        
        
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEscritura() {
        return escritura;
    }

    public void setEscritura(String escritura) {
        this.escritura = escritura;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void insereFuncionario(Funcionario fun){
        this.funcionarios.add(fun);
    }

    public ArrayList<Gado> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Gado> animais) {
        this.animais = animais;
    }
    
    public void insereAnimais(Gado a){
        this.animais.add(a);
    }

    public ArrayList<Pasto> getPastos() {
        return pastos;
    }

    public void setPastos(ArrayList<Pasto> pastos) {
        this.pastos = pastos;
    }
    
    public void inserePastos(Pasto p){
        this.pastos.add(p);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Gerencia getGerencia() {
        return gerencia;
    }

    public void setGerencia(Gerencia gerencia) {
        this.gerencia = gerencia;
    }
    
    

 

    
    
}

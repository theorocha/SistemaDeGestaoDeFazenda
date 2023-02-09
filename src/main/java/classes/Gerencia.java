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

public class Gerencia {
    private int totalFuncionarios;
    private double gastos;
    private double salarios;
    private double saldoFinal;
    private double saldoArrecadado;
    
    private Fazenda fazenda;

    public Gerencia(int totalFuncionarios, double gastos, double salarios, double saldoFinal, double saldoArrecadado) {
        this.totalFuncionarios = totalFuncionarios;
        this.gastos = gastos;
        this.salarios = salarios;
        this.saldoFinal = saldoFinal;
        this.saldoArrecadado = saldoArrecadado;
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public double getSaldoArrecadado() {
        return saldoArrecadado;
    }

    public void setSaldoArrecadado(double saldoArrecadado) {
        this.saldoArrecadado = saldoArrecadado;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }
    
    
    
    
}
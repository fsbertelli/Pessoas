package com.cdtpessoas;

public class PessoaFisica extends Pessoa {
    private double CPF;

    public PessoaFisica() {}

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }

    public double getCPF() {
        return this.CPF;
    }

    @Override
    public String getNome() {
        return "Pessoa fisica: " + super.getNome() + " CPF: " + this.getCPF();
    }
}

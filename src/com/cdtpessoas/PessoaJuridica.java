package com.cdtpessoas;

public class PessoaJuridica extends Pessoa {
    private long CNPJ;

    public PessoaJuridica() {}
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }
    public long getCNPJ() {
        return CNPJ;
    }
    @Override
    public String getNome() {
        return "Pessoa juridica: " + super.getNome() + " CNPJ: " + this.getCNPJ();
    }
}

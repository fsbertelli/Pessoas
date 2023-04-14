import com.cdtpessoas.*;

public class Main {
    public static void main(String[] args) {
        PessoaFisica PF = new PessoaFisica();
        PF.setNome("Felipe");
        PF.setCPF(123);
        System.out.println(PF.getNome());
        PessoaJuridica PJ = new PessoaJuridica();
        PJ.setNome("Tecsoil");
        PJ.setCNPJ(123123123);
        System.out.println(PJ.getNome());
        System.out.println("---APPLYING POLYMORPHISM---");
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = PF;
        pessoas[1] = PJ;
        for(Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
    }
}
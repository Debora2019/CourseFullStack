package AppClasses;

import AppClasses.interfaces.PermitirAcesso;

//Classe filha da SuperClasse Pessoa
public class Secretario extends Pessoa implements PermitirAcesso{

    private String registro;
    private String nivelCargos;
    private String experiencia;

    private String login;
    private String senha;

    //constructor com parametro
    public Secretario(String login, String senha) {
       this.login = login;
       this.senha = senha;
    }

       // constructor padrao
    public Secretario() {
    }
    


    @Override // é um método sobrescrito
    public double salario() {
     
        return 5870 * 0.89;
    }

       
    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;

        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargos() {
        return this.nivelCargos;
    }

    public void setNivelCargos(String nivelCargos) {
        this.nivelCargos = nivelCargos;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "{" +
            " registro='" + getRegistro() + "'" +
            ", nivelCargos='" + getNivelCargos() + "'" +
            ", experiencia='" + getExperiencia() + "'" +
            "}";
    }


}

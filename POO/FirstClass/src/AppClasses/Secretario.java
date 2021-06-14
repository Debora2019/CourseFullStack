package AppClasses;

//Classe filha da SuperClasse Pessoa
public class Secretario extends Pessoa{

    private String registro;
    private String nivelCargos;
    private String experiencia;


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

    @Override // é um método sobrescrito
    public double salario() {
     
        return 5870 * 0.89;
    }

    
}

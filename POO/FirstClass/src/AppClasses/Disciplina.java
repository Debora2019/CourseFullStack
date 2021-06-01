package AppClasses;

import java.util.Objects;

//Essa classe Disciplina servirá para todos os objetos e instancias de notas e disciplinas.
public class Disciplina {
    private double nota;
    private String disciplina;
 
    //Sets and Gets
    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }  

    //Método Equals
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Disciplina)) {
            return false;
        }
        Disciplina disciplina = (Disciplina) o;
        return nota == disciplina.nota && Objects.equals(disciplina, disciplina.disciplina);
    }

    //Método Hashcode
    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }

    //Método toString()
    @Override
    public String toString() {
        return "{" +
            " nota='" + getNota() + "'" +
            ", disciplina='" + getDisciplina() + "'" +
            "}";
    }

    
}

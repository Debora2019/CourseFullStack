package AppClasses;

import java.util.Objects;

//Essa classe Disciplina servirá para todos os objetos e instancias de notas e disciplinas.
public class Disciplina {
    // cada disciplina terá 4 notas 
    private double[] nota = new double[4];
    private String disciplina;
 
    //Sets and Gets
    public double[] getNota() {
        return this.nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
  

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
   } 

        public double getMediaNotas(){
            double somaTotal = 0; 
            for (int i = 0; i <nota.length; i++){
                somaTotal += nota[i];
            }
            return somaTotal/4;
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
        return Objects.equals(nota, disciplina.nota) && Objects.equals(disciplina, disciplina.disciplina);
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

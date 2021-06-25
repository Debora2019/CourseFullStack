package Thread;

import java.util.Objects;

public class ObjetoFilaThread {

    private String nome;
    private String email;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ObjetoFilaThread)) {
            return false;
        }
        ObjetoFilaThread objetoFilaThread = (ObjetoFilaThread) o;
        return Objects.equals(nome, objetoFilaThread.nome) && Objects.equals(email, objetoFilaThread.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    
}

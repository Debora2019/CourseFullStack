package AppClasses.interfaces;

public interface PermitirAcesso { //na interface só se declara o método
    public boolean autenticar();
    public boolean autenticar(String login, String senha);
    
}

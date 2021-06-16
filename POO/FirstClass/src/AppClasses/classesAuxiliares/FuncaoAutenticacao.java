package AppClasses.classesAuxiliares;

import AppClasses.interfaces.PermitirAcesso;

//so vai receber quem tem acesso a interface de PermitirAcesso e chamar o método autenticar
public class FuncaoAutenticacao {
    
    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }


    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }
  
}

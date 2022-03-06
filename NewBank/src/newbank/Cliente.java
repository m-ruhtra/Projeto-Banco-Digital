package newbank;

public class Cliente {
    protected String nome;
    
    public Cliente(){
        
    }
    
    public Cliente (String nome){
        this.setNome(nome);
    }
    
    public String getNome(){
        return nome;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
}

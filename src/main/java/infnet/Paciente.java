
package infnet;

public class Paciente {
    
    private String nome;
    private float peso;
    private boolean castrado;
    private String especie;
    
    public Paciente( String nome, float peso, boolean castrado, String especie){
        this.nome = nome;
        this.peso = peso;
        this.castrado = castrado;
        this.especie = especie;
    }
    
    @Override
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNome());
        sb.append(";");
        sb.append(this.getPeso());
        sb.append(";");
        sb.append(this.isCastrado());    
        sb.append(";");
        sb.append(this.getEspecie());
        
        return sb.toString();  
    
    }
    
    public String getNome() {
        return nome;
    }  
    
    public float getPeso() {
        return peso;
    }        
    
    public boolean isCastrado() {
        return castrado;
    }     
    
    public String getEspecie(){
        return especie;
    }
    
}

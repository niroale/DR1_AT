
package infnet;

public class Paciente {
    
    private String nomePaciente;
    private float pesoPaciente;
    private boolean castrado;
    private String especie;
    
    public Paciente( String nomePaciente, float pesoPaciente, boolean castrado, String especie){
        this.nomePaciente = nomePaciente;
        this.pesoPaciente = pesoPaciente;
        this.castrado = castrado;
        this.especie = especie;
    }
    
    @Override
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNomePaciente());
        sb.append(";");
        sb.append(this.getPesoPaciente());
        sb.append(";");
        sb.append(this.isCastrado());    
        sb.append(";");
        sb.append(this.getEspecie());
        
        return sb.toString();  
    
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }  
    
    public float getPesoPaciente() {
        return pesoPaciente;
    }        
    
    public boolean isCastrado() {
        return castrado;
    }     
    
    public String getEspecie(){
        return especie;
    }
    
}

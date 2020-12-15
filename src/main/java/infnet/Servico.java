
package infnet;

public abstract class Servico {
    
    private String veterinario;
    private String servico;
    private boolean emergencia;
    private boolean focinheira;    
    
    public Servico(String servico, String veterinario, boolean emergencia, boolean focinheira) {
        this.servico = servico;
        this.veterinario = veterinario;
        this.emergencia = emergencia;
        this.focinheira = Boolean.TRUE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getVeterinario());
        sb.append(";");
        sb.append(this.getServico());
        sb.append(";");
        sb.append(this.isFocinheira());          
        sb.append(";");
        sb.append(this.isEmergencia());    
        
        return sb.toString();        
    }
    
    public abstract boolean UsarFocinheira(Paciente p);

    public String getVeterinario() {
        return veterinario;
    }

    public String getServico() {
        return servico;
    }    

    public boolean isFocinheira() {
        return emergencia;
    }    
    
    public boolean isEmergencia() {
        return emergencia;
    }

    
}

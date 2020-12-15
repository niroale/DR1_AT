
package infnet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    
    private LocalDateTime data;
    private boolean emergencia;
    private Paciente paciente;

    
    public Pedido() {
        this.data = LocalDateTime.now();
        this.emergencia = Boolean.FALSE;
    }
    
    @Override
    public String toString() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        return String.format("%s;%s;%s", 
                                this.getData().format(formatter), this.emergencia, this.paciente.toString() 
                            );
}
    
    public LocalDateTime getData(){
        return data;
    }
    
    public boolean isEmergencia() {
        return emergencia;
    }
    
    public void setEmergencia(boolean emergencia){
        this.emergencia = emergencia;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    
}

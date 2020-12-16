
package infnet;

import exceptions.QtdConvulsaoException;

public class Neuro extends Servico{
    
    private boolean vacinado;
    private boolean convulsao;
    private int qtdConvulsaoDia; 

    public Neuro(String paciente, String veterinario, boolean emergencia, boolean focinheira) {
        super(paciente, veterinario, emergencia, focinheira);
    }

    @Override    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.isVacinado());
        sb.append(";");
        sb.append(this.isConvulsao());
        sb.append(";");
        sb.append(this.getQtdConvulsaoDia());
        
        return sb.toString();
    } 

    public boolean isVacinado(){
        return vacinado;
    }    

    public boolean isConvulsao(){
        return convulsao;
    }
    
    public int getQtdConvulsaoDia(){
        return qtdConvulsaoDia;
    }   

    @Override
    public float calcularValor(){
        return this.isEmergencia() ? 200 : 100 + (this.isVacinado() ? 150 : 250);
    } 
     
     public void setVacinado(boolean vacinado) {
         this.vacinado = vacinado;
     }
     
     public void setConvulsao(boolean convulsao){
         this.convulsao = convulsao;
     }
     
    public void setQtdConvulsaoDia(int qtdConvulsaoDia) throws QtdConvulsaoException {
        if (!convulsao) {
            throw new QtdConvulsaoException("Informar se houve casos de convulsão.");
                
        }
    } 
    
}
